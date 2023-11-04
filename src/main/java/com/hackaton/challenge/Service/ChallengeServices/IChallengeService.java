package com.hackaton.challenge.Service.ChallengeServices;


import com.hackaton.challenge.Entity.Challenge;

import java.util.List;

public interface IChallengeService {

    public Challenge createChallenge(Challenge challenge);
    public List<Challenge> getChallenges();

    public void deleteChallenge(Long id);

    public Challenge updateChallenge(Challenge challenge);
}
