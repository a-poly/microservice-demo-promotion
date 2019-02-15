package com.example;

import java.math.BigDecimal;


public class Promotion {

	private String code;
	private BigDecimal priceDiscount;
	private ShippingDiscount shippingDiscount;
	
	
	
	public Promotion() {
		super();
	}
	
	public Promotion(String code) {
		this();
		this.code = code;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getPriceDiscount() {
		return priceDiscount;
	}
	public void setPriceDiscount(BigDecimal priceDiscount) {
		this.priceDiscount = priceDiscount;
	}
	public void setPriceDiscount(Long priceDiscount) {
		setPriceDiscount(new BigDecimal(priceDiscount));
	}
	public void setPriceDiscount(Integer priceDiscount) {
		setPriceDiscount(new BigDecimal(priceDiscount));
	}
	public ShippingDiscount getShippingDiscount() {
		return shippingDiscount;
	}
	public void setShippingDiscount(ShippingDiscount shippingDiscount) {
		this.shippingDiscount = shippingDiscount;
	}

	
	
}
