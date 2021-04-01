package com.kronicles.kronicles_springBoot.controller;

import com.kronicles.kronicles_springBoot.Services.CategoryService;
import com.kronicles.kronicles_springBoot.model.Catergory;
import com.kronicles.kronicles_springBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "/category")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @GetMapping
    public List<Catergory> getAllUsers(){
        return categoryService.getAllCate();
    }
    @PostMapping
    public HashMap<String, Object> saveUsers(Catergory users){

        Catergory user1 = categoryService.addcate(users);

        HashMap<String, Object> response = new HashMap<>();
        response.put("status", 200);
        response.put("data", user1);
        response.put("message", "Success");

        return response;

    }


    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable int id){
        return categoryService.deleteproductbyid(id);
    }

    @PutMapping
    public Catergory updateUser(@RequestBody Catergory user){
        return categoryService.updateUser(user);
    }

}
