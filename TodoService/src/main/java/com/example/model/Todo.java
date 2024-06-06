package com.example.model;

public class Todo {
   int todoId;
   String name;
   String desc;
   
   
	public Todo() {
	    super();
	    this.todoId = 1;
	    this.name = "wakeup";
	    this.desc = "wakeup at 5o clock";
     }
	@Override
	public String toString() {
		return "Todo [todoId=" + todoId + ", name=" + name + ", desc=" + desc + "]";
	}
	public Todo(int todoId, String name, String desc) {
	super();
	this.todoId = todoId;
	this.name = name;
	this.desc = desc;
	}
	public int getTodoId() {
		return todoId;
	}
	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
   
}
