package com.demo.Todo_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.Todo_app.dto.Todo;
import com.demo.Todo_app.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService todoService;

	@GetMapping
	public String index(Model model) {
		model.addAttribute("todos", todoService.getAllTodos());
		model.addAttribute("newTodo", new Todo());
		return "index";
	}

	@PostMapping("/add")
	public String saveTodo(@ModelAttribute Todo todo) {
		todoService.saveTodo(todo);
		return "redirect:/";
	}

	@PostMapping("/delete")
	public String deleteTodo(@RequestParam Integer id) {
		todoService.deleteTodo(id);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public String editTodo(@RequestParam Integer id, Model model, RedirectAttributes redAtt) {
		Todo todo = todoService.getTodo(id);
		model.addAttribute("existTodo", todo);
//		System.out.println(todo);
		redAtt.addFlashAttribute("existTodo", todo);
//		System.out.println(todo);
		return "/edit";
	}
	
	@PostMapping("/edit")
	public String updateTodo(@ModelAttribute Todo todo) {
		todoService.updateTodo(todo);
		return "redirect:/";
	}
}