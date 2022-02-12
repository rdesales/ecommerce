package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.CartDao;
import com.ecommerce.app.entity.Product;

@Repository
public class CartDaoImp implements CartDao{

	List<Product> cart = new ArrayList<>();
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return cart;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		cart.add(product);
		
		//Validación cuando se agrega más de una unidad por producto
		//validación de cantidad de producto desde el front
		
		System.out.println("Product in cart.");
		
	}

}
