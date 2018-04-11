package com.example.demo;

import java.math.BigDecimal;

public class CurrentyBean {

	private BigDecimal quantity;
	private BigDecimal total;

	public CurrentyBean(BigDecimal quantity, BigDecimal total) {
		this.quantity = quantity;
		this.total = total;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
}
