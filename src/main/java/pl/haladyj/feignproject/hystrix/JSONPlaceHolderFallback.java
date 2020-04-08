package pl.haladyj.feignproject.hystrix;

import org.springframework.stereotype.Component;
import pl.haladyj.feignproject.client.JSONPlaceHolderClient;
import pl.haladyj.feignproject.model.Post;

import java.util.Collections;
import java.util.List;

@Component
public class JSONPlaceHolderFallback implements JSONPlaceHolderClient {

    @Override
    public List<Post> getPost() {
        return Collections.emptyList();
    }

    @Override
    public Post getPostById(Long postId) {
        return null;
    }
}
