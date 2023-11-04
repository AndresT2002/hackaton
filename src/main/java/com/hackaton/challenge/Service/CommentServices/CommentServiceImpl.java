package com.hackaton.challenge.Service.CommentServices;

import com.hackaton.challenge.Entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentServiceImpl implements ICommentService{
    @Override
    public Comment createComment(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> getComments() {
        return null;
    }

    @Override
    public void deleteComment(Long id) {

    }

    @Override
    public Comment updateComment(Long id) {
        return null;
    }
}
