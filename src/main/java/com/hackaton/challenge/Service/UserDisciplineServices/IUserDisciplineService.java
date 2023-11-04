package com.hackaton.challenge.Service.UserDisciplineServices;

import com.hackaton.challenge.Entity.Challenge;
import com.hackaton.challenge.Entity.UserDiscipline;

import java.util.List;

public interface IUserDisciplineService {

    public UserDiscipline createUserDiscipline(UserDiscipline userDiscipline);
    public List<UserDiscipline> getUserDisciplines();

    public void deleteUserDiscipline(Long id);

    public UserDiscipline updateUserDiscipline(Long id);
}
