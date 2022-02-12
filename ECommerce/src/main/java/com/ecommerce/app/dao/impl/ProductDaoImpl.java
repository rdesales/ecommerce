package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.ProductDao;
import com.ecommerce.app.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	

	List<Product> productsList = new ArrayList<>();

	@Override
	public List<Product> getProducts() {


		Product p1 = new Product();
		p1.setProductId(1);
		p1.setProductName("Samsung S21");
		p1.setCategory("mobile phone");
		p1.setPrice(800);
		p1.setProducQuantity(22);
		
		Product p2 = new Product();
		p2.setProductId(2);
		p2.setProductName("Smart tv 2");
		p2.setCategory("tv");
		p2.setPrice(500);
		p2.setProducQuantity(32);
		
		Product p3 = new Product();
		p3.setProductId(3);
		p3.setProductName("refrigerator");
		p3.setCategory("home");
		p3.setPrice(550);
		p3.setProducQuantity(34);
		
		Product p4 = new Product();
		p4.setProductId(4);
		p4.setProductName("laptop ???");
		p4.setCategory("home office");
		p4.setPrice(1100);
		p4.setProducQuantity(324);
		
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		productsList.add(p4);
		
		return productsList;
	}

}
