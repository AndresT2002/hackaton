package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
}
