package com.etiya.oop;

import lombok.*;

@AllArgsConstructor  //Tüm parametreleri iceren constructor
@NoArgsConstructor //Parametresiz constructor
@Data //hem @Getter hem @Setter
public class Product extends BaseEntity {       //özellik tutucu class  //veri tabani nesnesi Product
    //fields
    //private--sadece bu classtan erisim olacak
    //private encapsualtion icin kullaniliyor--Getter and Setter
    private int id;
    private String name;
    private String description;
    private double unitPrice;

  /*  //constructors
    public Product(){} //parametresiz constructor
    public Product(int id, String name, String description, double unitPrice) {   //paramtreli constructor
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    //getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;//this.id--en yakin olan, id--parameters
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }*/
}
