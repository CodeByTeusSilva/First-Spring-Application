package com.meuapp.springproject.services;

import com.meuapp.springproject.entities.Category;
import com.meuapp.springproject.entities.Order;
import com.meuapp.springproject.repositories.CategoryRepository;
import com.meuapp.springproject.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
