package com.kronicles.kronicles_springBoot.controller;

import com.kronicles.kronicles_springBoot.Repositories.ProductRepo;
import com.kronicles.kronicles_springBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo proRepo;

    /*
     * Get
     * */
    public List<Product> getAllproducts() {
        return proRepo.findAll();
    }

    public Product getProductByid(int id) {
        return proRepo.findById(id).orElse(null);
    }

    /*
     * Delete
     * */
    public String deleteproductbyid(int id) {
        proRepo.deleteById(id);
        return "Deleted";
    }

    public String deleteproduct(Product p) {
        proRepo.delete(p);
        return "Deleted";
    }

    /*
     * Update
     * */
    public Product updateProd(Product p) {
        Product prodUpdate = proRepo.findById(p.getId()).orElse(null);
        if (prodUpdate != null) {
            prodUpdate.setProduct_desc(p.getProduct_desc());
            prodUpdate.setProduct_name(p.getProduct_name());
            prodUpdate.setBuying_price(p.getBuying_price());
            prodUpdate.setSelling_price(p.getSelling_price());
        }
        return prodUpdate;
    }

    /*
     * Insert
     * */
    public List<Product> addProducts(List<Product> prod) {
        return proRepo.saveAll(prod);
    }

    public Product addProduct(Product prod) {
        return proRepo.save(prod);
    }


}
