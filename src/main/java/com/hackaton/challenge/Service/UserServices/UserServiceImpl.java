package com.hackaton.challenge.Service.UserServices;


import com.hackaton.challenge.Entity.User;
import com.hackaton.challenge.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  IUserServices{
    @Autowired
    IUserRepository userRepository;


    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {

        Optional<User> userById=userRepository.findById(id);

        if(userById.isPresent()) {
            User userObtained= userById.get();
            userRepository.delete(userObtained);
        }

    }

    @Override
    public User updateUser(User user) {


        Optional<User> userById=userRepository.findById(user.getId());

        if(!userById.isPresent()) {
            return null;
        }
        return userRepository.save(user);

    }

    @Override
    public User createUser(User user) {

        return userRepository.save(user);


    }
}
