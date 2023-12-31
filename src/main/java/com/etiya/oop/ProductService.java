package com.etiya.oop;

import com.etiya.oop.dtos.CreateProductRequest;
import com.etiya.oop.dtos.CreatedProductResponse;

public interface ProductService { //operasyon tutucu class-- bu siniflar her zaman soyutlanmali

    //void add(Product product);
    CreatedProductResponse add(CreateProductRequest createProductRequest);
}
