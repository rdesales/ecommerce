package com.ecommerce.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.app.dto.Transaction;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.CartService;

@Controller
public class CartController {

	@Autowired
	CartService cartService;
	
	
	
	//Showing cart
	@RequestMapping(value="/showCart", method = RequestMethod.GET)
	public ModelAndView showCart(ModelAndView modelAndView) {
		List<Product> cart = cartService.getProducts();
		//Aux
		System.out.println(cart);
		modelAndView.addObject("cart",cart);
		modelAndView.setViewName("cartview");
		return modelAndView;		
	}
	
	//Return productsview
	@RequestMapping(value="/addToCart", method = RequestMethod.POST)
	public String addToCart(@ModelAttribute Transaction transaction, Model model) {
		
		
		
		//Set el item aquí
		cartService.addProduct(product);
		System.out.println("adding product");
		
		
		return "productsView";
		
	}
	
}
