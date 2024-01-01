package com.etiya;

import com.etiya.basics.VariablesAndLoops;
import com.etiya.oop.Category;
import com.etiya.oop.Product;
public class Main {
    public static void main(String[] args) {
        //VariablesAndLoops variablesAndLoops = new VariablesAndLoops();  //Java'da bir classi kullanmak icin instance etmen gerekiyor
        //class isimleri PascalCase, degiskenler camelCase
        //variablesAndLoops.Run();



        //PRODUCT
        Product product1 = new Product();  //parametresiz constructorla olan
        product1.setId(1);
        product1.setName("Elma");
        product1.setUnitPrice(10);
        product1.setDescription("Kırmızı bir elma");


        //constructr'in kolayligi
        Product product2  = new Product(2, "Armut","Yeşil bir armut",11);  //parametreli constructorla olan

        System.out.println(product1);
        System.out.println(product2);


        //CATEGORY
        Category category1 = new Category();  //parametresiz constructorla olan
        category1.setId(1);
        category1.setName("Sebze");
        category1.setDescription("Sebze kategorisi");

        Category category2  = new Category(2, "Meyve","Meyve kategorisi");  //parametreli constructorla olan

        System.out.println(category1);
        System.out.println(category2);
    }
}