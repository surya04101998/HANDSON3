package com.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.cart.dao.CartDAO;
import com.cart.dao.ItemDetailsDAO;
import com.cart.dao.UserDAO;

@Controller
public class CartController {
	@Autowired
	CartDAO cartRepo;
	@Autowired
	ItemDetailsDAO itemsRepo;
	@Autowired
	UserDAO usersRepo;
	
	@GetMapping("/")
	public void getAllDetails() {
		System.out.println(cartRepo.findAll());
		System.out.println(itemsRepo.findAll());
		System.out.println(usersRepo.findAll());
	}
	
	
}