package com.in28minutes.springboot.studentservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.springboot.studentservices.model.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "user1", "Gain experience in Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "user1", "Check all depencies", new Date(), false));
        todos.add(new Todo(3, "user", "Publish to github", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
