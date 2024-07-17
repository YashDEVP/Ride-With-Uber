package com.codingshuttle.project.uber.uberApp.entities;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double rating;

    private String available;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(columnDefinition = "Geometry(Point, 4326")/* 4326 it specifies that we are dealing with earth*/
    Point currentLocation;
}
