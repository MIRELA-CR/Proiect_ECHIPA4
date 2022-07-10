package com.demo.springdemo.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="t_museum")

public class Museum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "visitor")
    private int visitor;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JoinColumn(name="id_city")
    private City city;

}