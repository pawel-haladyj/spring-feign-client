package pl.haladyj.feignproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.haladyj.feignproject.client.JSONPlaceHolderClient;
import pl.haladyj.feignproject.model.Post;

import java.util.List;

@RestController
public class PostController {

    private final JSONPlaceHolderClient client;

    public PostController(JSONPlaceHolderClient client) {
        this.client = client;
    }
    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable("id") Long id){
        return client.getPostById(id);
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return client.getPost();
    }
}
