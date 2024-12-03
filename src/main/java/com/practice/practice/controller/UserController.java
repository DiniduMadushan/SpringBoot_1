package com.practice.practice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "one User";
    }

}
