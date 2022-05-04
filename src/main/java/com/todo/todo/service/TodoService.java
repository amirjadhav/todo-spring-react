package com.todo.todo.service;

import java.util.List;

import com.todo.todo.dto.TodoDto;

public interface TodoService {

    TodoDto addTodo(TodoDto todoDto);

    List<TodoDto> getAllTodos();

}
