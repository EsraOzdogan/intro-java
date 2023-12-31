package com.etiya.oop.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreatedProductResponse {
    private int id;
    private String name;
    private String description;
    private double unitPrice;
    private LocalDateTime createdDate;
}
