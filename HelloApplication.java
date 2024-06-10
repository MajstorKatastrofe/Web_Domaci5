package com.example.publicBlog;

import com.example.publicBlog.repositories.CommentRepository;
import com.example.publicBlog.repositories.InMemoryPostRepository;
import com.example.publicBlog.repositories.PostRepository;
import com.example.publicBlog.services.PostService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class HelloApplication extends ResourceConfig {

    public HelloApplication() {

        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(InMemoryPostRepository.class).to(PostRepository.class).in(Singleton.class);
                this.bind(InMemoryPostRepository.class).to(CommentRepository.class).in(Singleton.class);

                this.bindAsContract(PostService.class);
            }
        };
        register(binder);

        packages("com.example.publicBlog.resources");
    }

}