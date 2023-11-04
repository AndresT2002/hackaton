package com.hackaton.challenge.Service.UserDisciplineServices;


import com.hackaton.challenge.Entity.User;
import com.hackaton.challenge.Entity.UserDiscipline;
import com.hackaton.challenge.Repository.IUserDisciplineRepository;
import com.hackaton.challenge.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDisciplineServiceImpl implements IUserDisciplineService{

    @Autowired
    IUserDisciplineRepository userDisciplineRepository;

    @Override
    public UserDiscipline createUserDiscipline(UserDiscipline userDiscipline) {
        return userDisciplineRepository.save(userDiscipline);
    }

    @Override
    public List<UserDiscipline> getUserDisciplines() {
        return userDisciplineRepository.findAll();
    }

    @Override
    public void deleteUserDiscipline(Long id) {
        Optional<UserDiscipline> userDisciplineById=userDisciplineRepository.findById(id);

        if(userDisciplineById.isPresent()) {
            UserDiscipline userObtained= userDisciplineById.get();
            userDisciplineRepository.delete(userObtained);
        }

    }

    @Override
    public UserDiscipline updateUserDiscipline(UserDiscipline userDiscipline) {

        Optional<UserDiscipline> userDisciplineById=userDisciplineRepository.findById(userDiscipline.getId());

        if(!userDisciplineById.isPresent()) {
            return null;
        }
        return userDisciplineRepository.save(userDiscipline);
    }
}
