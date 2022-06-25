package com.demo.springdemo.model;

public class City {
    private String city;
    private String country;
    private int totalMuseums;

    public City(String city, String country, int totalMuseums) {
        this.city = city;
        this.country = country;
        this.totalMuseums = totalMuseums;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotalMuseums() {
        return totalMuseums;
    }

    public void setTotalMuseums(int totalMuseums) {
        this.totalMuseums = totalMuseums;
    }
}
