package com.etiya.basics;

public class VariablesAndLoops {
    public void Run(){
        //value types
        int number1 = 10;
        int number2 = 20;
        double price = 10.5;     //ondalikli sayi
        boolean isItTrue = true;

        //reference types
        String firstName = "Esra";
        char firstLetter = 'A';


        number1 = number2; //value types sadece deger atar
        number2 = 100;
        System.out.println(number1);


        String firstName2 = "Sacettin";
        firstName = firstName2;    //reference types ama cok yogun kullanildigi icin string tipi value type seklinde calisir
        firstName2 = "Helin";
        System.out.println(firstName);

        if(firstName == "Sacettin"){
        }

        for (int i=1; i<10; i++){
        }


        String[] cities = {"Ankara","İstanbul","İzmir"};

        for (String city:cities){      //for (var city:cities){
            System.out.println((city));
        }
    }
}
