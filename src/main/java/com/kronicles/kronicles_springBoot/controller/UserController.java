package com.kronicles.kronicles_springBoot.controller;


import com.kronicles.kronicles_springBoot.Services.UserService;
import com.kronicles.kronicles_springBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public HashMap<String, Object> saveUsers(@RequestBody User users){
//        return userService.addUser(users);

        User user1 = userService.addUser(users);

        HashMap<String, Object> response = new HashMap<>();
        response.put("status", 200);
        response.put("data", user1);
        response.put("message", "Success");

        return response;

    }


    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteproductbyid(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
