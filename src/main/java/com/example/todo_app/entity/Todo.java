package com.example.todo_app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Todo {
        @Id 
        private Long id;
        private String title;
        private String description;
        private LocalDate dueDate;
        private boolean completed;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

}