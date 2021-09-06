package com.cursojavanelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavanelio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
