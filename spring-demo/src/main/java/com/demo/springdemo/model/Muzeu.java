package com.demo.springdemo.model;

public class Muzeu {
    private String desc;
    private float bilet;
    private String nume;

    public Muzeu(String desc, float bilet, String nume) {
        this.desc = desc;
        this.bilet = bilet;
        this.nume = nume;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getBilet() {
        return bilet;
    }

    public void setBilet(float bilet) {
        this.bilet = bilet;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
