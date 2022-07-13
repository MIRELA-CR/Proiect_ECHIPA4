package com.demo.springdemo.service;

import com.demo.springdemo.dto.MuseumDto;
import com.demo.springdemo.model.Museum;
import com.demo.springdemo.dto.MuseumDto;
import com.demo.springdemo.repository.MuseumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MuseumService {

    @Autowired
    MuseumRepository museumRepository;

    public List<MuseumDto> getAllMuseums() {
        List<Museum> museumList = museumRepository.findAll();

          List<MuseumDto> museumDtoList = museumList.stream()
                .map(this::mapToMuseum)
                .collect(Collectors.toList());

        return museumDtoList;
    }

    private MuseumDto mapToMuseum(Museum museum) {
        return MuseumDto.builder()
                .id(museum.getId())
                .name(museum.getName())
                .address(museum.getAddress())
                .visitor(museum.getVisitor())
                .cityName(museum.getCity().getName())
                .build();
    }

    public void saveMuseum(Museum museum) {
        museumRepository.save(museum);
    }

    public Museum getMuseumById(int id) {
        return museumRepository.findById(id).get();
    }

    public void deleteMuseum(int id) {
        museumRepository.deleteById(id);
    }
}