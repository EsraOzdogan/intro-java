package com.etiya.oop.dtos;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateProductRequest {
    private int id;
    private String name;
    private String description;
    private double unitPrice;
}
