package com.todo.todo.controller;

import java.util.List;

import com.todo.todo.dto.TodoDto;
import com.todo.todo.entity.Todo;
import com.todo.todo.service.TodoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class TodoController {
    @GetMapping
    public String hello() {
        return "Hello";
    }

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    ResponseEntity<List<TodoDto>> getTodos() {
        List<TodoDto> todoDtos = todoService.getAllTodos();
        return new ResponseEntity<>(todoDtos, HttpStatus.OK);
    }

    @PostMapping("/add-todo")
    ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto) {
        TodoDto todoDto2 = todoService.addTodo(todoDto);
        return new ResponseEntity<>(todoDto2, HttpStatus.CREATED);
    }

}
