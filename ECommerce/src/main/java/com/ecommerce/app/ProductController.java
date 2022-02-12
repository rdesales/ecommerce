package com.ecommerce.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.ProductService;


@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public ModelAndView getAllProducts(ModelAndView modelAndView) {
		List<Product> productsList = productService.getProductsList();
		modelAndView.addObject("productsList",productsList);
		modelAndView.setViewName("productsview");
		return modelAndView;
	}
	
}
