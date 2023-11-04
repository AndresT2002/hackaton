package com.hackaton.challenge.Service.RelationshipServices;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Relationship;

import java.util.List;

public interface IRelationshipService {
    public Relationship createRelationship(Relationship relationship);
    public List<Relationship> getRelationships();

    public void deleteRelationship(Long id);

    public Relationship updateRelationship(Relationship relationship);

}
