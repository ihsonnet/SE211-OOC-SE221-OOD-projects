package com.excercise;

public class Car {
    int Price;
    String Model;

    public Car(String model,int price) {
        Price = price;
        Model = model;
        System.out.println("This is a Brand new Car.");
        Engine();
        System.out.println("Car Model: "+model);
        System.out.println("Car Price is "+price);
    }

    void Engine(){
        System.out.println("Have An Engine.");
    }

    void radio(){
        System.out.println("Extra Feature: FM Radio");
    }
}
