package com.example.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TodosRowMapper implements RowMapper<Todo> {
	

		@Override
		public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Todo todo = new  Todo(rs.getInt(1), rs.getString(2),rs.getString(3));
			return todo;
		}

	
}



