package com.etiya.oop;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category extends BaseEntity {
    private int id;
    private String name;
    private String description;
}
