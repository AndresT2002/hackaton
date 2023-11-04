package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Comment;
import com.hackaton.challenge.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommentRespository extends JpaRepository<Comment,Long> {
    @Query("SELECT u FROM Comment u WHERE u.post_id = ?1")
    List<Comment> findCommentsByPostId(Long postId);

}
