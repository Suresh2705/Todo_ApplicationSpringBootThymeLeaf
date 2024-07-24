package com.demo.Todo_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Todo_app.dto.Todo;

public interface TodoRepo extends JpaRepository<Todo, Integer>{
	
}