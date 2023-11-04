package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRelationshipRepository extends JpaRepository<Relationship,Long> {
}
