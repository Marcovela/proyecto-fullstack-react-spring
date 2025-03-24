package com.example.prueba_spring_1.repository;

import com.example.prueba_spring_1.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
