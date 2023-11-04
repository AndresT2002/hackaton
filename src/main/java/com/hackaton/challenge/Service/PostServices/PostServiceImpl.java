package com.hackaton.challenge.Service.PostServices;

import com.hackaton.challenge.Entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements IPostService{
    @Override
    public Post createPost(Post post) {
        return null;
    }

    @Override
    public List<Post> getPosts() {
        return null;
    }

    @Override
    public void deletePost(Long id) {

    }

    @Override
    public Post updatePost(Long id) {
        return null;
    }
}
