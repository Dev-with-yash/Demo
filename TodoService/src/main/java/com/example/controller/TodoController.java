package com.example.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.Service.TodoService;
import com.example.model.Todo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/todo")
public class TodoController {
    
	@Autowired
	TodoService service;
	
	@GetMapping("/display")
	public List<Todo> getAllNotes(){
		return service.displayTodos();
	}
	
	@PostMapping("/add")
	public Todo addTodo(@RequestBody  Todo todo) {
		return service.addTodos(todo);
	}
	@GetMapping("/search/{todoId}")
	public List<Todo> searchTodo(@PathVariable int todoId){
		return service.searchTodos(todoId);
	}
	
	@DeleteMapping("/delete/{todoId}")
	public boolean deleteTodo(@PathVariable int todoId) {
		return service.deleteTodos(todoId);
	}
	
   
}
