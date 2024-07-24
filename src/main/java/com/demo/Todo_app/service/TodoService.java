package com.demo.Todo_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Todo_app.dao.TodoDAO;
import com.demo.Todo_app.dto.Todo;

@Service
public class TodoService {

	@Autowired
	private TodoDAO todoDao;

	public Todo saveTodo(Todo todo) {
		return todoDao.saveTodo(todo);
	}

	public List<Todo> getAllTodos() {
		return todoDao.getAllTodos();
	}

	public Todo getTodo(int id) {
		return todoDao.getTodo(id);
	}

	public boolean deleteTodo(int id) {
		todoDao.deleteTodo(id);
		if (todoDao.getTodo(id) == null)
			return true;
		return false;
	}

	public Todo updateTodo(Todo todo) {
		return todoDao.updateTodo(todo);
	}
}