package com.example.car_store.model;

public class Owner {
    private String CPF;
    private String RG;
    private String name;
    private int age;
    private char gender;
    private String city;
    private String phone;
    private String email;

    public Owner(String CPF, String RG, String name, int age, char gender, String city, String phone, String email) {
        this.CPF = CPF;
        this.RG = RG;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }
}
