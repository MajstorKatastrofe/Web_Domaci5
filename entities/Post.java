package com.example.publicBlog.entities;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private Integer id;
    private String time;

    @NotNull(message = "Title filed is required")
    @NotEmpty(message = "Title field is required")
    private String title;

    @NotNull(message = "Content filed is required")
    @NotEmpty(message = "Content field is required")
    private String content;

    private List<Comment> comments = new ArrayList<>();

    @NotNull(message = "Author filed is required")
    @NotEmpty(message = "Author field is required")
    private String author;

    public Post() {}

    public Post(String title, String content, String author, String time) {
        this();
        this.title = title;
        this.content = content;
        this.author = author;
        this.time = time;
    }


    public Post(Integer id, String title, String content, String author, String time) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setPublishedAt(LocalDateTime now) {
    }
}
