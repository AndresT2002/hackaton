package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRespository extends JpaRepository<Post,Long> {
}
