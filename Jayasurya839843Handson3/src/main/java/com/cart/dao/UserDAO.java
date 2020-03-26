package com.cart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.models.User;

public interface UserDAO extends JpaRepository<User, Long> {
}
