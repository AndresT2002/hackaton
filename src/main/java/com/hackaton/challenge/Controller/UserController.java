package com.hackaton.challenge.Controller;

import com.hackaton.challenge.Entity.Comment;
import com.hackaton.challenge.Entity.User;
import com.hackaton.challenge.Service.UserServices.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    @PutMapping()
    public ResponseEntity<?> updateUser(@RequestBody User user){
        User userUpdated = userServices.updateUser(user);
        return new ResponseEntity<>(userUpdated, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        userServices.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping()
    public ResponseEntity<?> getUsers(){
        return new ResponseEntity<>(userServices.getUsers(), HttpStatus.OK);
    }



}
