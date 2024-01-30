package com.meuapp.springproject.repositories;

import com.meuapp.springproject.entities.Order;
import com.meuapp.springproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
