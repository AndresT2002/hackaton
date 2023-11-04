package com.hackaton.challenge.Controller;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Service.ChallengeServices.IChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/challenge")
public class ChallengeController {
    @Autowired
    IChallengeService challengeService;


    @PostMapping()
    public ResponseEntity<?> createChallenge(@RequestBody Challenge challenge){
        Challenge challengeCreated = challengeService.createChallenge(challenge);
        return new ResponseEntity<>(challengeCreated, HttpStatus.CREATED);
    }


}
