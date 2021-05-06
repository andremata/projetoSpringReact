package com.andremata.dsvendas.dto;

import java.io.Serializable;

import com.andremata.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String sallerName;
	private long visited;
	private long deals;

	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, long visited, long deals) {
		sallerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public long getVisited() {
		return visited;
	}

	public void setVisited(long visited) {
		this.visited = visited;
	}

	public long getDeals() {
		return deals;
	}

	public void setDeals(long deals) {
		this.deals = deals;
	}
}
