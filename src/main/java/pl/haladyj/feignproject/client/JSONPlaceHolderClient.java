package pl.haladyj.feignproject.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.haladyj.feignproject.config.MyClientConfiguration;
import pl.haladyj.feignproject.hystrix.JSONPlaceHolderFallback;
import pl.haladyj.feignproject.model.Post;

import java.util.List;

@FeignClient(value = "jplaceholder", //any value, given by code author
        url = "https://jsonplaceholder.typicode.com/", //url that supplies data
        configuration = MyClientConfiguration.class, //config class - int this case OkHttpClient
        fallback = JSONPlaceHolderFallback.class) //hystrix fallback class
public interface JSONPlaceHolderClient {

    @GetMapping(value = "/posts")
    List<Post> getPost();

    @GetMapping(value = "/posts/{id}")
    Post getPostById(@PathVariable("id") Long postId);

}
