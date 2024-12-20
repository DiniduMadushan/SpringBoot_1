package com.practice.practice.controller;

import com.practice.practice.dto.UserDTO;
import com.practice.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getusers")
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/adduser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateuser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteuser")
    public String deleteuser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

}
