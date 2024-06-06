package com.example.Dao;

import java.util.List;

import com.example.model.Todo;

public interface TodoDao {
    public Todo addTodos(Todo todo);
    public List<Todo> displayTodos();
    public List<Todo> searchTodos(int todoId);

	boolean deleteTodos(int todoId);
}
