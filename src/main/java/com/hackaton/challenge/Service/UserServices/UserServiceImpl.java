package com.hackaton.challenge.Service.UserServices;


import com.hackaton.challenge.Entity.User;
import com.hackaton.challenge.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  IUserServices{
    @Autowired
    IUserRepository userRepository;


    @Override
    public User createUser(User user) {

        return userRepository.save(user);


    }
}
