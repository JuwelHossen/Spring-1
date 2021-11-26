package com.example.react.controller;

import com.example.react.exception.NotFountException;
import com.example.react.model.PhoneUser;
import com.example.react.repo.PhoneUserRepo;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class PhoneUserController
{

    @Autowired
    private PhoneUserRepo repo;

    //get all users list
    @GetMapping("/users")
    //@ResponseBody
    public List<PhoneUser> getAllUsers(){
        return repo.findAll();
    }

    //post to the database user object
     @PostMapping("/users")
    public PhoneUser phoneUser(@RequestBody PhoneUser phoneUser)
    {
        return repo.save(phoneUser);
    }
//    //get user object
//    //get user by id
    @GetMapping("/users/{id}")
    public PhoneUser getOneUser(@PathVariable long id)
    {
        PhoneUser phoneUser =repo.findById(id);
        return phoneUser;
    }


}
