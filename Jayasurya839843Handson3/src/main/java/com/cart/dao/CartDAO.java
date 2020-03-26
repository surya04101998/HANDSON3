package com.cart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.models.Cart;

public interface CartDAO extends JpaRepository<Cart	, Long> {

}
