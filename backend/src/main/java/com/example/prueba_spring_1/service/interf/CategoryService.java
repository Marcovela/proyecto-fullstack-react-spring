package com.example.prueba_spring_1.service.interf;

import com.example.prueba_spring_1.dto.CategoryDto;
import com.example.prueba_spring_1.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);

    Response updateCategory(Long categoryId, CategoryDto categoryRequest);

    Response getAllCategories();

    Response getCategoryById(Long categoryId);

    Response deleteCategory(Long categoryId);
}
