package com.cart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.models.ItemDetails;

@Repository
public interface ItemDetailsDAO extends JpaRepository<ItemDetails	, Long> {

}
