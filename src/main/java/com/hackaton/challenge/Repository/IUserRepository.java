package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Post;
import com.hackaton.challenge.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {


    Optional<User> findByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    User findByEmailAndPassword(String email, String password);

    @Query("SELECT u FROM User u WHERE u.name = ?1")
    User findByName(String name);
}
