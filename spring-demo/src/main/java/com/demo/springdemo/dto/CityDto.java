package com.demo.springdemo.dto;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {

    private int id;
    private String name;
    private String country;
    private int totalMuseums;
}