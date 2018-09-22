package com.vovo.springbootframe.controller;

import com.vovo.springbootframe.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user")
    public User AddUser(){


        return null;
    }



}
