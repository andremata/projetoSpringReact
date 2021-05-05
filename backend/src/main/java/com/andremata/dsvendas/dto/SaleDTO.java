package com.andremata.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.andremata.dsvendas.entities.Sale;

public class SaleDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private int visited;
	private int deals;
	private double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO() {
	}

	public SaleDTO(long id, int visited, int deals, double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale sale) {
		id = sale.getId();
		visited = sale.getVisited();
		deals = sale.getDeals();
		amount = sale.getAmount();
		date = sale.getDate();
		seller = new SellerDTO(sale.getSeller());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVisited() {
		return visited;
	}

	public void setVisited(int visited) {
		this.visited = visited;
	}

	public int getDeals() {
		return deals;
	}

	public void setDeals(int deals) {
		this.deals = deals;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
