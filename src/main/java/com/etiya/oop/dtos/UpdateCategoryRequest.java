package com.etiya.oop.dtos;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateCategoryRequest {
    private int id;
    private String name;
    private String description;
}
