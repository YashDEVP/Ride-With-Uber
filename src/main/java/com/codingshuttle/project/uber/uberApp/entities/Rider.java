package com.codingshuttle.project.uber.uberApp.entities;

import jakarta.persistence.*;

public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double rating;

    @OneToOne
    @JoinColumn(name = "user_id") //Primary key for this user
    private User user;
}
