package com.example.todo_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todo_app.entity.Todo;
import com.example.todo_app.repository.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public void save(Todo todo){
        todoRepository.save(todo);
    }

    public void toggleCompleted(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        todo.setCompleted(!todo.isCompleted());
        todoRepository.save(todo);
    }
}