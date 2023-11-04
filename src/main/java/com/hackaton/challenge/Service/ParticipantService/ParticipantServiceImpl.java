package com.hackaton.challenge.Service.ParticipantService;

import com.hackaton.challenge.Entity.Participant;
import com.hackaton.challenge.Entity.Relationship;
import com.hackaton.challenge.Repository.IParticipantRespository;
import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantServiceImpl implements  IParticipantService{

    @Autowired
    IParticipantRespository participantRespository;


    @Override
    public Participant createParticipant(Participant participant) {
        return participantRespository.save(participant);
    }

    @Override
    public List<Participant> getParticipants() {
        return participantRespository.findAll();
    }

    @Override
    public void deleteParticipant(Long id) {
        Optional<Participant> participantById=participantRespository.findById(id);

        if(participantById.isPresent()) {
            Participant participantObtained= participantById.get();
            participantRespository.delete(participantObtained);
        }

    }

    @Override
    public Participant updateParticipant(Participant participant) {
        Optional<Participant> participantById=participantRespository.findById(participant.getId());

        if(!participantById.isPresent()) {
            return null;
        }
        return participantRespository.save(participant);
    }
}
