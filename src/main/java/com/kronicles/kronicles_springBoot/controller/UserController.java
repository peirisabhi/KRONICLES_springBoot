package com.kronicles.kronicles_springBoot.controller;


import com.kronicles.kronicles_springBoot.Services.UserService;
import com.kronicles.kronicles_springBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/getAllUSer")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/addUser")
    public User saveUsers(@RequestBody User users){
        return userService.addUser(users);
    }


    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteproductbyid(id);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
