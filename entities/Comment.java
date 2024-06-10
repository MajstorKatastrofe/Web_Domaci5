package com.example.publicBlog.entities;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Comment {

    private Integer id;

    @NotNull(message = "Name field is required")
    @NotEmpty(message = "Name field is required")
    private String name;

    @NotNull(message = "Comment field is required")
    @NotEmpty(message = "Comment field is required")
    private String text;

    public Comment() {}

    public Comment(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public Comment(Integer id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
