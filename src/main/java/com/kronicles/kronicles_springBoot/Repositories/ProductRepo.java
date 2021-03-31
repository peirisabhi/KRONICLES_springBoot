package com.kronicles.kronicles_springBoot.Repositories;

import com.kronicles.kronicles_springBoot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
