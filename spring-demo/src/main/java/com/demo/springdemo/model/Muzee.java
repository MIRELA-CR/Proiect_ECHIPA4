package com.demo.springdemo.model;
public class Muzee {
    private String name;
    private String address;
    private int visitor;
    private String type;
    private String city;


    public Muzee(String name, String address, int visitor, String type, String city) {
        this.name = name;
        this.address = address;
        this.visitor = visitor;
        this.type = type;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getVisitor() {
        return visitor;
    }

    public void setVisitor(int visitor) {
        this.visitor = visitor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }
}