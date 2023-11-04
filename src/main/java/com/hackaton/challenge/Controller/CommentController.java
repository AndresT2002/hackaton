package com.hackaton.challenge.Controller;

import com.hackaton.challenge.Entity.Comment;
import com.hackaton.challenge.Service.CommentServices.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    ICommentService commentService;

    @PostMapping()
    public ResponseEntity<?> createComment(@RequestBody Comment comment){
        Comment commentCreated = commentService.createComment(comment);
        return new ResponseEntity<>(commentCreated, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<?> updateComment(@RequestBody Comment comment){
        Comment commentUpdated = commentService.updateComment(comment);
        return new ResponseEntity<>(commentUpdated, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteComment(@PathVariable Long id){
        commentService.deleteComment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
