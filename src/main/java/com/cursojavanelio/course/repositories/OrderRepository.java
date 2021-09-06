package com.cursojavanelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavanelio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
