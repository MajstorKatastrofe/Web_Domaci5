package com.example.publicBlog.services;

import com.example.publicBlog.entities.Comment;
import com.example.publicBlog.entities.Post;
import com.example.publicBlog.repositories.CommentRepository;
import com.example.publicBlog.repositories.PostRepository;

import javax.inject.Inject;
import java.util.List;

public class CommentService {

    public CommentService(){
        System.out.println(this);
    }

    @Inject
    private CommentRepository commentRepository;

    public Comment addComment(Comment comment){ return this.commentRepository.addComment(comment); }

    public List<Comment> getAllComments(){ return this.commentRepository.getAllComments(); }

}
