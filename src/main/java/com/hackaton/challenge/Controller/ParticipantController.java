package com.hackaton.challenge.Controller;


import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Participant;
import com.hackaton.challenge.Service.ParticipantService.IParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/participant")
@CrossOrigin("*")
public class ParticipantController {

    @Autowired
    IParticipantService participantService;

    @PostMapping(name="/subscribe")
    public ResponseEntity<?> createParticipant(@RequestBody Participant participant){
        Participant participantCreated = participantService.createParticipant(participant);
        return new ResponseEntity<>(participantCreated, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}/{challenge}")
    public ResponseEntity<?> deleteParticipant(@PathVariable Long id,@PathVariable Long challenge){
        participantService.deleteByIdChallenge(id,challenge);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
