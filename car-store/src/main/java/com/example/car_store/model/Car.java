package com.example.car_store.model;

public class Car {
    private String brand;
    private String model;
    private double price;
    private int manufactureYear;
    private String description;
    private int horsepower;
    private double weight;
    private Owner owner;

    public Car(String brand, String model, double price, int manufactureYear, String description, int horsepower, double weight, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureYear = manufactureYear;
        this.description = description;
        this.horsepower = horsepower;
        this.weight = weight;
        this.owner = owner;
    }
}
