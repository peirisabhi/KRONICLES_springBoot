package com.kronicles.kronicles_springBoot.controller;

import com.kronicles.kronicles_springBoot.Repositories.ProductRepo;
import com.kronicles.kronicles_springBoot.Services.ProductService;
import com.kronicles.kronicles_springBoot.Services.UserService;
import com.kronicles.kronicles_springBoot.model.Product;
import com.kronicles.kronicles_springBoot.model.User;
import org.apache.tomcat.jni.Proc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    ProductService prodServ;


    /*
     * GET
     * */
    @GetMapping
    public List<Product> getallProds() {
        return prodServ.getAllproducts();
    }

    @GetMapping
    public Product ProductbyId(@PathVariable int pid) {
        return prodServ.getProductByid(pid);
    }

    /*
     * ADD
     * */

    @PostMapping
    public HashMap<String, Object> saveProdlist(@RequestBody List<Product> products) {

        HashMap<String, Object> response = new HashMap<>();
        response.put("status", 200);
        response.put("data", products);
        response.put("message", "Success");

        return response;

    }

    @PostMapping
    public HashMap<String, Object> saveProds(@RequestBody Product product) {
        HashMap<String, Object> response = new HashMap<>();
        response.put("status", 200);
        response.put("data", product);
        response.put("message", "Success");
        return response;
    }

    /*
     * DELETE
     * */
    @DeleteMapping("{id}")
    public HashMap<String, Object> deleteProds(@PathVariable int id) {
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> response = new HashMap<>();
        response.put("status", 200);
        response.put("data", "");
        response.put("message", "Success");
        return response;

    }

    /*
     * UPDATE
     * */

    @PutMapping
    public HashMap<String, Object> updateProds(@RequestBody Product prods) {
        HashMap<String, Object> response = new HashMap<>();
        response.put("status", 200);
        response.put("data", prods);
        response.put("message", "Success");
        return response;
    }


}
