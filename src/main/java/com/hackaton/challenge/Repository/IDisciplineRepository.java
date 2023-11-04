package com.hackaton.challenge.Repository;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDisciplineRepository extends JpaRepository<Discipline,Long> {
}
