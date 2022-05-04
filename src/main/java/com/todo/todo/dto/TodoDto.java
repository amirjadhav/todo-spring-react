package com.todo.todo.dto;

public class TodoDto {
    private Long id;
    private String title;

    public TodoDto() {
    }

    public TodoDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", title=" + title + "]";
    }
}
