package com.meuapp.springproject.repositories;

import com.meuapp.springproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
