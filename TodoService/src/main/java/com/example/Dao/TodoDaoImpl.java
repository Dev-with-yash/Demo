package com.example.Dao;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Todo;
import com.example.model.TodosRowMapper;


@Repository
public class TodoDaoImpl implements TodoDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	List<Todo> todos;

	public TodoDaoImpl() {
		new ArrayList<Todo>();
	}

	@Override
	public Todo addTodos(Todo todo) {
		String query = "insert into Todo values (?,?,?)";
		int k = jdbcTemplate.update(query, todo.getTodoId(), todo.getName(), todo.getDesc());
		if (k == 1) {
			return todo;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Todo> displayTodos() {
	
		String sql = "select * from Todos";
		TodosRowMapper mapper = new TodosRowMapper();
		return jdbcTemplate.query(sql,mapper);
	}

	@Override
	public List<Todo> searchTodos(int todoId) {
		
		
		List<Todo> tds = displayTodos();
		List<Todo> result = tds.stream().filter(n->n.getTodoId() == todoId).map(x->x).collect(Collectors.toList());
		return result;
	}

	@Override
	public boolean deleteTodos(int todoId) {
	    String sql = "delete from Todos where todoId = ?";
	    int k = jdbcTemplate.update(sql, todoId);
	    if (k==1) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	     
	}

}
