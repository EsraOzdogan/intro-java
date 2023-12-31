package com.etiya.oop;

import com.etiya.oop.dtos.CreateProductRequest;
import com.etiya.oop.dtos.CreatedProductResponse;

public class ProductServiceImpl implements ProductService{

    /*@Override
   public void add(Product product) {
   }*/

    @Override
    public CreatedProductResponse add(CreateProductRequest createProductRequest) {
        //todo :mapper
        Product product = new Product();
        product.setName(createProductRequest.getName());
        product.setDescription(createProductRequest.getDescription());
        product.setUnitPrice(createProductRequest.getUnitPrice());

        //todo: save to repository

        //todo: map to response object aka:CreatedProductResponse


        //Category->id,name,description,createdate etc...
        return null;
    }

}

//response request pattern
