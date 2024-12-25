package com.example.car_store.dto;

public class BasicCarInfoResponseDTO {
    private int ID;
    private String brand;
    private String model;
    private double price;
    private int manufactureYear;

    public BasicCarInfoResponseDTO(int ID, String brand, String model, double price, int manufactureYear) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureYear = manufactureYear;
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
}
