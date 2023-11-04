package com.hackaton.challenge.Controller;

import com.hackaton.challenge.Entity.User;
import com.hackaton.challenge.Service.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserServices userServices;

    @PostMapping()

    public ResponseEntity<User> createUser(@RequestBody User user){

        User userCreated=userServices.createUser(user);

        return new ResponseEntity<>(userCreated, HttpStatus.OK);


    }



}
