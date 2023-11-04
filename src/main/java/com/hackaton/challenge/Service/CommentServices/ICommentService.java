package com.hackaton.challenge.Service.CommentServices;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Comment;

import java.util.List;

public interface ICommentService {

    public Comment createComment(Comment comment);
    public List<Comment> getComments();

    public void deleteComment(Long id);

    public Comment updateComment(Long id);

}
