package com.cursojavanelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavanelio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
