package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Dao.TodoDao;
import com.example.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	TodoDao dao;
	List<Todo> todos;
	
	
	public TodoServiceImpl() {
		super();
	}

	@Override
	public Todo addTodos(@RequestBody Todo todo) {
		
		return dao.addTodos(todo);
	}

	@Override
	public List<Todo> displayTodos() {
	
		return dao.displayTodos();
	}

	@Override
	public List<Todo> searchTodos(int todoId) {
		
		return dao.searchTodos(todoId);
	}

	@Override
	public boolean deleteTodos(int todoId) {
		
		return dao.deleteTodos(todoId);
	}

}
