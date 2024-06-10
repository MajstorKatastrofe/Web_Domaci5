package com.example.publicBlog.resources;

import com.example.publicBlog.entities.Comment;
import com.example.publicBlog.entities.Post;
import com.example.publicBlog.services.PostService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;

@Path("/posts")
public class PostResource {

    @Inject
    private PostService postService;

    // Endpoint za dobijanje svih postova
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response all() {
        return Response.ok(postService.getAllPosts()).build();
    }

    // Endpoint za kreiranje novog posta
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@Valid Post post) {
        post.setPublishedAt(LocalDateTime.now());
        return Response.ok(postService.addPost(post)).build();
    }


    // Endpoint za dobijanje jednog posta po ID-u
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") Integer id) {
        return Response.ok(postService.getPostById(id)).build();
    }

    // Endpoint za dodavanje komentara na post
    @POST
    @Path("/{id}/comments")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCommentToPost(@PathParam("id") Integer id, @Valid Comment comment) {
        postService.addCommentToPost(id, comment);
        return Response.status(Response.Status.CREATED).build();
    }



}
