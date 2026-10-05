package com.example.todo_app.controller;

import org.springframework.stereotype.Controller;

import com.example.todo_app.service.TodoService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todos")
    public String index() {
        return "todos";
    }
}