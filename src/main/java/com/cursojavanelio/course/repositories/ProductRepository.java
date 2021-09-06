package com.cursojavanelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavanelio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
