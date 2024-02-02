package com.meuapp.springproject.repositories;

import com.meuapp.springproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
