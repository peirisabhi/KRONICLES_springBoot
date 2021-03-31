package com.kronicles.kronicles_springBoot.Repositories;

import com.kronicles.kronicles_springBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
