package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IParticipantRespository extends JpaRepository<Participant,Long> {
}
