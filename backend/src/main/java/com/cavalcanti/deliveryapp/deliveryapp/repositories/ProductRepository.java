package com.cavalcanti.deliveryapp.deliveryapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cavalcanti.deliveryapp.deliveryapp.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
}
