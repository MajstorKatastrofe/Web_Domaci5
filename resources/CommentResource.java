package com.example.publicBlog.resources;

import com.example.publicBlog.entities.Comment;
import com.example.publicBlog.entities.Post;
import com.example.publicBlog.services.CommentService;
import com.example.publicBlog.services.PostService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//
//@Path("/posts/${postId}/")
//public class CommentResource {
//
//    @Inject
//    private CommentService commentService;
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response all() { return Response.ok(this.commentService.getAllComments()).build(); }
//
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    public Comment create(@Valid Comment comment) { return this.commentService.addComment(comment); }
//
//}
