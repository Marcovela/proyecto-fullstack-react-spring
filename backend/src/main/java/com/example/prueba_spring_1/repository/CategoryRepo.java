package com.example.prueba_spring_1.repository;

import com.example.prueba_spring_1.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
