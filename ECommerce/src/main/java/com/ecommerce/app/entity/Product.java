package com.ecommerce.app.entity;

public class Product {

	private Integer productId;
	private String productName;
	private String category;
	private double price;
	private double producQuantity;
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getProducQuantity() {
		return producQuantity;
	}
	public void setProducQuantity(double producQuantity) {
		this.producQuantity = producQuantity;
	}
	
	
}
