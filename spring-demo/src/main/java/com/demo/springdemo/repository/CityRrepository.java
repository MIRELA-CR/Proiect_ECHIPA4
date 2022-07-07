package com.demo.springdemo.repository;

import com.demo.springdemo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRrepository extends JpaRepository<City, Integer>{
}
