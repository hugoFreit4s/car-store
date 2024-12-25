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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
