package com.hackaton.challenge.Service.ChallengeServices;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Comment;
import com.hackaton.challenge.Repository.IChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ChallengeServiceImpl implements  IChallengeService{

    @Autowired
    IChallengeRepository challengeRepository;


    @Override
    public Challenge createChallenge(Challenge challenge) {
        return challengeRepository.save(challenge);
    }

    @Override
    public List<Challenge> getChallenges() {
        return challengeRepository.findAll();
    }

    @Override
    public void deleteChallenge(Long id) {
        Optional<Challenge> challengeById=challengeRepository.findById(id);

        if(challengeById.isPresent()) {
            Challenge challengeObtained= challengeById.get();
            challengeRepository.delete(challengeObtained);
        }

    }

    @Override
    public Challenge updateChallenge(Challenge challenge) {
        Optional<Challenge> challengeById=challengeRepository.findById(challenge.getId());

        if(!challengeById.isPresent()) {
            return null;
        }
        return challengeRepository.save(challenge);
    }
}
