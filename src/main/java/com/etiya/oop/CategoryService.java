package com.etiya.oop;

import com.etiya.oop.dtos.CreateCategoryRequest;
import com.etiya.oop.dtos.CreatedCategoryResponse;

public interface CategoryService {
    CreatedCategoryResponse add(CreateCategoryRequest createCategoryRequest);

}
