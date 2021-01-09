package com.cavalcanti.deliveryapp.deliveryapp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cavalcanti.deliveryapp.deliveryapp.dto.OrderDTO;
import com.cavalcanti.deliveryapp.deliveryapp.entities.Order;
import com.cavalcanti.deliveryapp.deliveryapp.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {

		List<Order> list = repository.findAll() ;

		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());

		
	}
	@Transactional(readOnly = true)
	public List<OrderDTO> findPendingProducts() {

		List<Order> list = repository.findOrdersWithProducts()  ;

		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());

		
	}
	 
}
