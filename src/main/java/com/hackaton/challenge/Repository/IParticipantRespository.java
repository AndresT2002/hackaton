package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Participant;
import com.hackaton.challenge.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IParticipantRespository extends JpaRepository<Participant,Long> {

    @Query("SELECT u FROM Participant u WHERE u.user = ?1 AND u.challenge_id = ?2")
    Optional<Participant> getParticipantByUserIdChallenge(Long userId, Long challenge);
}
