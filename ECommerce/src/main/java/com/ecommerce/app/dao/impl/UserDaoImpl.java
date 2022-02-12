package com.ecommerce.app.dao.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.UserDao;
import com.ecommerce.app.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	private static HashMap<String, User> userDatabase = new HashMap<>();
	
	@Override
	public void saveUser(User user) {
		userDatabase.put(user.getName(), user);
		System.out.println(user.getName() + " details saved");
		
	}

	@Override
	public User authenticateUser(String name, String password) {
		
		User u = userDatabase.get(name);
		if (u.getPassword().equals(password) && u != null)
			return u;
		
		return null;
	}

}
