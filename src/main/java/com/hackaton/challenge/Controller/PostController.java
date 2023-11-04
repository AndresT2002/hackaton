package com.hackaton.challenge.Controller;

import com.hackaton.challenge.Entity.Post;
import com.hackaton.challenge.Service.PostServices.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@CrossOrigin("*")
public class PostController {

    @Autowired
    IPostService postService;


    @PostMapping()
    public ResponseEntity<?> createPost(@RequestBody Post post){
        Post postCreted = postService.createPost(post);

        return new ResponseEntity<>(postCreted, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<?> updatePost(@RequestBody Post post){
        Post postUpdated = postService.updatePost(post);
        return new ResponseEntity<>(postUpdated, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePost(@PathVariable Long id){
        postService.deletePost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getPosts(){
        return new ResponseEntity<>(postService.getPosts(), HttpStatus.OK);
    }



    @GetMapping("/{userId}")
    public ResponseEntity<?> getPostsByUserId(@PathVariable Long userId){
        return new ResponseEntity<>(postService.getPostByUserId(userId), HttpStatus.OK);
    }
}
