package com.example.car_store.dto;

public class DetailedCarInfoResponseDTO {
    private int ID;
    private String brand;
    private String model;
    private double price;
    private int manufactureYear;
    private String description;
    private int horsepower;
    private int weight;

    public DetailedCarInfoResponseDTO(int ID, String brand, String model, double price, int manufactureYear, String description, int horsepower, int weight) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureYear = manufactureYear;
        this.description = description;
        this.horsepower = horsepower;
        this.weight = weight;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
