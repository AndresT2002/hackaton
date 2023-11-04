package com.hackaton.challenge.Service.DisciplineServices;

import com.hackaton.challenge.Entity.Discipline;
import com.hackaton.challenge.Entity.Participant;
import com.hackaton.challenge.Repository.ICommentRespository;
import com.hackaton.challenge.Repository.IDisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplineServiceImpl implements  IDisciplineService{

    @Autowired
    IDisciplineRepository disciplineRepository;


    @Override
    public Discipline createDiscipline(Discipline discipline) {
        return disciplineRepository.save(discipline);
    }

    @Override
    public List<Discipline> getDisciplines() {
        return disciplineRepository.findAll();
    }

    @Override
    public void deleteDiscipline(Long id) {
        Optional<Discipline> disciplineById=disciplineRepository.findById(id);

        if(disciplineById.isPresent()) {
            Discipline disciplineObtained= disciplineById.get();
            disciplineRepository.delete(disciplineObtained);
        }


    }

    @Override
    public Discipline updateDiscipline(Discipline discipline) {
        Optional<Discipline> disciplineById=disciplineRepository.findById(discipline.getId());

        if(!disciplineById.isPresent()) {
            return null;
        }
        return disciplineRepository.save(discipline);
    }
}
