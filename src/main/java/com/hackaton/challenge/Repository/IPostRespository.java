package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Comment;
import com.hackaton.challenge.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IPostRespository extends JpaRepository<Post,Long> {


    @Override
    Optional<Post> findById(Long id);
}
