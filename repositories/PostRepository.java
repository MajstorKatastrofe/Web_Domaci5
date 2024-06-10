package com.example.publicBlog.repositories;

import com.example.publicBlog.entities.Post;

import java.util.List;

public interface PostRepository {

    public Post addPost(Post post);

    public List<Post> getAllPosts();

    public Post getPostById(Integer id);

    public void addComment(Post post);

    void updatePost(Post post);
}
