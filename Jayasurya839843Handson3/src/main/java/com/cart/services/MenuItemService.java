package com.cart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.dao.ItemDetailsDAO;
import com.cart.models.ItemDetails;

@Service
public class MenuItemService  {
	
	@Autowired
	ItemDetailsDAO itemRepo;
	
	public void setMenuItem(ItemDetails item){
		itemRepo.save(item);
	}
	
	public List<ItemDetails> getMenuItemAdmin(){
		return itemRepo.findAll();
	}
	
	public List<ItemDetails> getMenuItemListCustomer(){
		return itemRepo.findAll();
	}
	
	public ItemDetails getMenuItem(long id) {
		return itemRepo.findById(id).get();
	}
	
	public void editMenuItem(ItemDetails menu) {
		itemRepo.save(menu);
	}
	
	
}
