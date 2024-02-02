package com.meuapp.springproject.repositories;

import com.meuapp.springproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
