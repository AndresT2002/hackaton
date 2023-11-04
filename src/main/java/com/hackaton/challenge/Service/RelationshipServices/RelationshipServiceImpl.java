package com.hackaton.challenge.Service.RelationshipServices;

import com.hackaton.challenge.Entity.Relationship;
import com.hackaton.challenge.Entity.UserDiscipline;
import com.hackaton.challenge.Repository.IRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class RelationshipServiceImpl implements IRelationshipService{

    @Autowired
    IRelationshipRepository relationshipRepository;


    @Override
    public Relationship createRelationship(Relationship relationship) {
        return relationshipRepository.save(relationship);
    }

    @Override
    public List<Relationship> getRelationships() {
        return relationshipRepository.findAll();
    }

    @Override
    public void deleteRelationship(Long id) {
        Optional<Relationship> relationshipById=relationshipRepository.findById(id);

        if(relationshipById.isPresent()) {
            Relationship relationshipObtained= relationshipById.get();
            relationshipRepository.delete(relationshipObtained);
        }
    }

    @Override
    public Relationship updateRelationship(Relationship relationship) {
        Optional<Relationship> relationshipById=relationshipRepository.findById(relationship.getId());

        if(!relationshipById.isPresent()) {
            return null;
        }
        return relationshipRepository.save(relationship);

    }
}
