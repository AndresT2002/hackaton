package com.hackaton.challenge.Service.PostServices;

import com.hackaton.challenge.Entity.Comment;
import com.hackaton.challenge.Entity.Participant;
import com.hackaton.challenge.Entity.Post;
import com.hackaton.challenge.Repository.IParticipantRespository;
import com.hackaton.challenge.Repository.IPostRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements IPostService{

    @Autowired
    IPostRespository postRespository;


    @Override
    public Post createPost(Post post) {
        return postRespository.save(post);
    }

    @Override
    public List<Post> getPosts() {
        return postRespository.findAll();
    }

    @Override
    public void deletePost(Long id) {

        Optional<Post> postById=postRespository.findById(id);

        if(postById.isPresent()) {
            Post postObtained= postById.get();
            postRespository.delete(postObtained);
        }

    }

    @Override
    public Post updatePost(Post post) {
        Optional<Post> postById=postRespository.findById(post.getId());

        if(!postById.isPresent()) {
            return null;
        }
        return postRespository.save(post);
    }

    @Override
    public Post getPostById(Long id) {

        Optional<Post> postById=postRespository.findById(id);

        if(!postById.isPresent()) {
            return null;
        }

        return postById.get();
    }

    @Override
    public List<Comment> getCommentsByPost(Long id) {
        return postRespository.findAllCommentsByPostId(id);
    }
}
