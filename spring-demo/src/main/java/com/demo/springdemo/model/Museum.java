package com.demo.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Museum {
    private String name;
    private String address;
    private int visitor;
    private String type;
    private String city;

}