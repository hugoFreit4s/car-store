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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
