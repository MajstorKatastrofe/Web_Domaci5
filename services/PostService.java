package com.example.publicBlog.services;

import com.example.publicBlog.entities.Comment;
import com.example.publicBlog.entities.Post;
import com.example.publicBlog.repositories.PostRepository;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

public class PostService {

    @Inject
    private PostRepository postRepository;


    public Post addPost(Post post) {
        post.setPublishedAt(LocalDateTime.now());
        return postRepository.addPost(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.getAllPosts();
    }

    public Post getPostById(int id) {
        return postRepository.getPostById(id);
    }

    public void addCommentToPost(int postId, Comment comment) {
        Post post = getPostById(postId);
        if (post != null) {
            post.getComments().add(comment);
            postRepository.updatePost(post); // Dodajemo post kako bismo ažurirali komentare
        }
    }
}
