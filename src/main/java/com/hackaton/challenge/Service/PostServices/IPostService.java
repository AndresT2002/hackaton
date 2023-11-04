package com.hackaton.challenge.Service.PostServices;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Post;

import java.util.List;

public interface IPostService {
    public Post createPost(Post post);
    public List<Post> getPosts();
    public void deletePost(Long id);

    public Post updatePost(Long id);
}
