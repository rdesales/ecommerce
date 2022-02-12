package com.ecommerce.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.app.dto.Credential;
import com.ecommerce.app.entity.User;
import com.ecommerce.app.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	//Sort of welcome page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showRegistrationPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "registration"; 	//This is a view
		
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String doRegistration(@ModelAttribute User user,Model model) {
		userService.saveUser(user);	
		Credential credential = new Credential();
		model.addAttribute("credential",credential);
		return "login";   //This is a view
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticateUser(@ModelAttribute Credential credential) {
		User user  = userService.authenticateUser(credential.getName(), credential.getPassword());
		if(ObjectUtils.isEmpty(user))
			return "loginfailure";
		return "redirect:/getProducts";
			
	}
	
	
}
