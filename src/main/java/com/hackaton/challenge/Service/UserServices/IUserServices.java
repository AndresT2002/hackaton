package com.hackaton.challenge.Service.UserServices;

import com.hackaton.challenge.Entity.User;
import com.hackaton.challenge.Entity.UserDiscipline;

import java.util.List;

public interface IUserServices {

    public List<User> getUsers();

    public void deleteUser(Long id);

    public User updateUser(User user);

    public User createUser(User user);

    public User getUserByEmail(String email);
    public User login(String email, String password);

    public User findByEmail(String email);


}
