package com.cursojavanelio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojavanelio.course.entities.Category;
import com.cursojavanelio.course.entities.Order;
import com.cursojavanelio.course.entities.User;
import com.cursojavanelio.course.repositories.CategoryRepository;
import com.cursojavanelio.course.repositories.OrderRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
	
	

}
