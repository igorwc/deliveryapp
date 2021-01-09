package com.cavalcanti.deliveryapp.deliveryapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cavalcanti.deliveryapp.deliveryapp.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{
	
	@Query("select DISTINCT o from Order o "
			+ "JOIN FETCH o.products where o.status = 0 ORDER BY o.moment asc ")
	List<Order> findOrdersWithProducts();
	
}
