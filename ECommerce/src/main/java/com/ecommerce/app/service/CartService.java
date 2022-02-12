package com.ecommerce.app.service;

import java.util.List;

import com.ecommerce.app.entity.Product;

public interface CartService {

	public List<Product> getProducts();
	
	public void addProduct(Product product);
}
