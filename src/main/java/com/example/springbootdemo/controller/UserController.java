package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @GetMapping("/findById/{id}")
//    public User findById(@PathVariable("id") Integer id){
//        return userService.findById(id);
//    }

    @GetMapping("/Hello")
    public String helloDocker(){
        return "Hello Docker";
    }
}
