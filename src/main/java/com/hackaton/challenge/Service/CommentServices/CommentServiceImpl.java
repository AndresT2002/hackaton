package com.hackaton.challenge.Service.CommentServices;

import com.hackaton.challenge.Entity.Comment;
import com.hackaton.challenge.Entity.Discipline;
import com.hackaton.challenge.Repository.ICommentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CommentServiceImpl implements ICommentService{

    @Autowired
    ICommentRespository commentRespository;


    @Override
    public Comment createComment(Comment comment) {
        return commentRespository.save(comment);
    }

    @Override
    public List<Comment> getComments() {
        return commentRespository.findAll();
    }
//falta agregar comentarios de un post y un post por id
    @Override
    public void deleteComment(Long id) {

        Optional<Comment> commentById=commentRespository.findById(id);

        if(commentById.isPresent()) {
            Comment commentObtained= commentById.get();
            commentRespository.delete(commentObtained);
        }
    }

    @Override
    public Comment updateComment(Comment comment) {
        Optional<Comment> disciplineById=commentRespository.findById(comment.getId());

        if(!disciplineById.isPresent()) {
            return null;
        }
        return commentRespository.save(comment);
    }

    @Override
    public List<Comment> getCommentsByPostId(Long id) {
        return commentRespository.findCommentsByPostId(id);
    }
}
