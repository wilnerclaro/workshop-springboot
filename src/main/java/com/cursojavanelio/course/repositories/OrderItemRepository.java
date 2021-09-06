package com.cursojavanelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavanelio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
