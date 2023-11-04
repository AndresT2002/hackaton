package com.hackaton.challenge.Service.ParticipantService;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Participant;

import java.util.List;

public interface IParticipantService {


    public Participant createParticipant(Participant participant);
    public List<Participant> getParticipants();

    public void deleteParticipant(Long id);

    public Participant updateParticipant(Participant participant);

    public void deleteByIdChallenge(Long id, Long challenge);
}
