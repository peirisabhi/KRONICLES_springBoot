package com.kronicles.kronicles_springBoot.Services;

import com.kronicles.kronicles_springBoot.Repositories.UserRepo;
import com.kronicles.kronicles_springBoot.model.Product;
import com.kronicles.kronicles_springBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    /*
     * Delete
     * */
    public String deleteproductbyid(int id) {
        userRepo.deleteById(id);
        return "Deleted";
    }



    /*
     * Update
     * */
    public User updateUser(User u) {
        User userreUpdate = userRepo.findById(u.getId()).orElse(null);
        if (userreUpdate != null) {
            userreUpdate.setName(u.getName());
            userreUpdate.setPassword(u.getPassword());
            userreUpdate.setAge(u.getAge());
            userreUpdate.setTelephone(u.getTelephone());
            userreUpdate.setUsername(u.getUsername());
        }
        return userreUpdate;
    }

    /*
     * Insert
     * */
    public List<User> addUsers(List<User> user) {
        return userRepo.saveAll(user);
    }

    public User addUser(User prod) {
        return userRepo.save(prod);
    }



}