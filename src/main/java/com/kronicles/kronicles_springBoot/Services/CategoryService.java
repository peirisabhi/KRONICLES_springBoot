package com.kronicles.kronicles_springBoot.Services;

import com.kronicles.kronicles_springBoot.Repositories.CatergatoryRepo;
import com.kronicles.kronicles_springBoot.Repositories.UserRepo;
import com.kronicles.kronicles_springBoot.model.Catergory;
import com.kronicles.kronicles_springBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {
    @Autowired
    CatergatoryRepo cateRepo;

    public List<Catergory> getAllCate(){
        return cateRepo.findAll();
    }

    /*
     * Delete
     * */
    public String deleteproductbyid(int id) {
        cateRepo.deleteById(id);
        return "Deleted";
    }



    /*
     * Update
     * */
    public Catergory updateUser(Catergory u) {
        Catergory cateeUpdate = cateRepo.findById(u.getId()).orElse(null);
        if (cateeUpdate != null) {
            cateeUpdate.setCatergory(u.getCatergory());
            cateeUpdate.setCatergory_desc(u.getCatergory_desc());
        }
        return cateeUpdate;
    }

    /*
     * Insert
     * */
    public List<Catergory> addacte(List<Catergory> user) {
        return cateRepo.saveAll(user);
    }

    public Catergory addcate(Catergory prod) {
        return cateRepo.save(prod);
    }



}
