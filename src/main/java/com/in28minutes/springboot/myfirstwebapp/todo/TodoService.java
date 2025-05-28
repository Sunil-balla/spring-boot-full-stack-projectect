package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	/*
	 * private int id;
	private String username;
	private String description;
	private LocalDate targetDate;
	private boolean done;*/
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "in28minutes", "LearnAwsAdv",
				LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "in28minutes", "LearnDevops",
					LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "in28minutes", "Learn full Stack Development",
						LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate date, boolean done) {
		todos.add(new Todo(++todosCount, username, description, date, done));
	}
	
	public void deleteTodo(int id) {
		Predicate<? super Todo> predicate =
				todo -> todo.getId() == id;
				todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
			return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteTodo(todo.getId());
		todos.add(todo);
	}

}
