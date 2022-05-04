package com.todo.todo.service;

import java.util.ArrayList;
import java.util.List;

import com.todo.todo.dto.TodoDto;
import com.todo.todo.entity.Todo;
import com.todo.todo.repository.TodoRepository;

import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    TodoRepository todoRepository;

    TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        Todo todo = new Todo(todoDto.getId(), todoDto.getTitle());
        Todo todo1 = todoRepository.save(todo);
        return new TodoDto(todo1.getId(), todo1.getTitle());
    }

    @Override
    public List<TodoDto> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();

        List<TodoDto> todoDtos = new ArrayList<>();

        for (Todo t : todos) {
            todoDtos.add(new TodoDto(t.getId(), t.getTitle()));
        }
        return todoDtos;
    }

}
