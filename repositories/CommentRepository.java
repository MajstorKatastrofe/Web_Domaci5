package com.example.publicBlog.repositories;

import com.example.publicBlog.entities.Comment;
import com.example.publicBlog.entities.Post;

import java.util.List;

public interface CommentRepository {

    public Comment addComment(Comment comment);

    public List<Comment> getAllComments();

}
