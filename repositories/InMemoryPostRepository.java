package com.example.publicBlog.repositories;

import com.example.publicBlog.entities.Comment;
import com.example.publicBlog.entities.Post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryPostRepository implements PostRepository, CommentRepository{

    private static List<Post> posts = new CopyOnWriteArrayList<>();
    private static List<Comment> comments = new CopyOnWriteArrayList<>();

    public InMemoryPostRepository() {
        System.out.println(this);
    }

    @Override
    public synchronized Post addPost(Post post) {
        Integer id = posts.size();
        post.setId(id);
        posts.add(Math.toIntExact(id), post);
        LocalDateTime localDateTime = LocalDateTime.now();
        String time = localDateTime.getDayOfMonth() + "." + localDateTime.getMonthValue() + "." + localDateTime.getYear();
        post.setTime(time);

        return post;
    }
    @Override
    public List<Post> getAllPosts() {
        return new ArrayList<>(posts);
    }

    @Override
    public Post getPostById(Integer id) {
        return posts.get(id);
    }

    @Override
    public void addComment(Post post) {
    }

    @Override
    public synchronized Comment addComment(Comment comment) {
        Integer id = comments.size();
        comment.setId(id);
        comments.add(Math.toIntExact(id), comment);

        return comment;
    }

    @Override
    public List<Comment> getAllComments() {
        return new ArrayList<>(comments);
    }
    @Override
    public void updatePost(Post post) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getId().equals(post.getId())) {
                posts.set(i, post); // Ažuriramo postojeći post u listi
                break; // Prekidamo petlju nakon što pronađemo i ažuriramo post
            }
        }
    }

}
