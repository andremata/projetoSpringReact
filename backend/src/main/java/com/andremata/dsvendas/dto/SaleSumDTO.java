package com.andremata.dsvendas.dto;

import java.io.Serializable;

import com.andremata.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String sallerName;
	private double sum;
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, double sum) {
		sallerName = seller.getName();
		this.sum = sum;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
}
