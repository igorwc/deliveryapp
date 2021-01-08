package com.cavalcanti.deliveryapp.deliveryapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cavalcanti.deliveryapp.deliveryapp.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
