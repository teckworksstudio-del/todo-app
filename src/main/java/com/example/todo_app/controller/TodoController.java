package com.example.todo_app.controller;

import org.springframework.stereotype.Controller;

import com.example.todo_app.entity.Todo;
import com.example.todo_app.service.TodoService;
import java.util.List;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todos")
    public String index(Model model) {
        List<Todo> todos = todoService.findAll();
        model.addAttribute("todos", todos);
        return "todos";
    }

    @PostMapping("/todos")
    public String create(Todo todo) {
        todoService.save(todo);
        return "redirect:/todos";
    }

    @PostMapping("/todos/{id}/toggle")
    public String toggleCompleted(@PathVariable Long id) {
        todoService.toggleCompleted(id);
        return "redirect:/todos";
    }
}