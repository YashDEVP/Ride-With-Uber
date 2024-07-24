package com.codingshuttle.project.uber.uberApp.entities;

import jakarta.persistence.*;

import java.util.List;

public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    private Double balance;

    @OneToMany(mappedBy="wallet",fetch = FetchType.LAZY)
    private List<WalletTransaction> transaction;
}
