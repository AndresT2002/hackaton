package com.hackaton.challenge.Service.DisciplineServices;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.Discipline;

import java.util.List;

public interface IDisciplineService {

    public Discipline createDiscipline(Discipline discipline);
    public List<Discipline> getDisciplines();

    public void deleteDiscipline(Long id);

    public Discipline updateDiscipline(Long id);
}
