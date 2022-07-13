package com.demo.springdemo.dto;

import com.demo.springdemo.model.City;
import lombok.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MuseumDto {

    private int id;
    private String name;
    private String address;
    private int visitor;
    private String type;
    private String cityName;
}