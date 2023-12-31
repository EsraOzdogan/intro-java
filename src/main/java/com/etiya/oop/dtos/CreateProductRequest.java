package com.etiya.oop.dtos;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateProductRequest {   //son kulanicinin görmedigi veri tabani nesne özellikleri // CreateProductDto denmemeli req ve res farkli olarak ayrilamli
    //reqte id yollamiyoruz
    private String name;
    private String description;
    private double unitPrice;
}


