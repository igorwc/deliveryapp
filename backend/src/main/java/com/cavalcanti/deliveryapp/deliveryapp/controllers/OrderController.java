package com.cavalcanti.deliveryapp.deliveryapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cavalcanti.deliveryapp.deliveryapp.dto.OrderDTO;
import com.cavalcanti.deliveryapp.deliveryapp.dto.ProductDTO;
import com.cavalcanti.deliveryapp.deliveryapp.services.OrderService;
import com.cavalcanti.deliveryapp.deliveryapp.services.ProductService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll(){
		List<OrderDTO> list = service.findPendingProducts();
		
		return ResponseEntity.ok().body(list);
	}

}
