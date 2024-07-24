package com.demo.Todo_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.Todo_app.dto.Todo;
import com.demo.Todo_app.repo.TodoRepo;

@Repository
public class TodoDAO {
	
	@Autowired
	TodoRepo todoRepo;
	
	public Todo saveTodo(Todo todo) {
		return todoRepo.save(todo);
	}
	
	public List<Todo> getAllTodos(){
		return todoRepo.findAll();
	}
	
	public Todo getTodo(int id) {
		Optional<Todo> findById = todoRepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
	
	public boolean deleteTodo(int id) {
		todoRepo.deleteById(id);
		return true;
	}
	
	public Todo updateTodo(Todo todo) {
		return todoRepo.save(todo);
	}
}