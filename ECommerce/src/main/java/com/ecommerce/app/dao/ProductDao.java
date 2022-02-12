package com.ecommerce.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.entity.Product;

public interface ProductDao {

	

	List<Product> getProducts();
}
