package com.demo.springdemo.service;

import com.demo.springdemo.dto.CityDto;
import com.demo.springdemo.model.City;
import com.demo.springdemo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public List<CityDto> getAllCities() {
        List<City> cityList = cityRepository.findAll();

        List<CityDto> cityDtoList = cityList.stream()
                .map(this::mapToCity)
                .collect(Collectors.toList());

     return cityDtoList;
    }
    private CityDto mapToCity(City city) {
        return CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .country(city.getCountry())
                .totalMuseums(city.getTotalMuseums())
                .build();
    }


    public void saveCity(City city) {
        cityRepository.save(city);
    }

    public City getCityById(int id) {
        return cityRepository.findById(id).get();
    }

    public void deleteCity(int id) {
        cityRepository.deleteById(id);
    }
}