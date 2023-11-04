package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChallengeRepository extends JpaRepository<Challenge,Long> {
}
