package com.etiya.oop;

import com.etiya.oop.dtos.CreateCategoryRequest;
import com.etiya.oop.dtos.CreatedCategoryResponse;

public class CategoryServiceImpl implements CategoryService{
    @Override
    public CreatedCategoryResponse add(CreateCategoryRequest createCategoryRequest) {
        Category category = new Category();
        category.setName(createCategoryRequest.getName());
        category.setDescription(createCategoryRequest.getDescription());
        return null;
    }
}
