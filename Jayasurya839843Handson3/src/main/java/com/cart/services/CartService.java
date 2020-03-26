package com.cart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.dao.CartDAO;
import com.cart.dao.ItemDetailsDAO;
import com.cart.dao.UserDAO;
import com.cart.models.Cart;
import com.cart.models.ItemDetails;
import com.cart.models.User;


@Service
public class CartService {
	@Autowired
	UserDAO userRepo;

	@Autowired
	CartDAO cartRepo;

	@Autowired
	ItemDetailsDAO itemsRepo;

	public void addCartItem(long userId, long menuItemId) {
		User user = userRepo.findById(userId).get();
		Cart cart = user.getCart();
		ItemDetails menu  = itemsRepo.findById(menuItemId).get();
		cart.getMenuItemList().add(menu);
		cartRepo.save(cart);
	}

	public List<ItemDetails> getAllCartItems(long userId) {
		User user = userRepo.findById(userId).get();
		Cart cart = user.getCart();
		
		return cart.getMenuItemList();
	}

	public void removeCartItem(long userId, long menuItemId) {
		User user = userRepo.findById(userId).get();
		Cart cart = user.getCart();
		ItemDetails menu  = itemsRepo.findById(menuItemId).get();
		cart.getMenuItemList().remove(menu);
		cartRepo.save(cart);
	}
}
