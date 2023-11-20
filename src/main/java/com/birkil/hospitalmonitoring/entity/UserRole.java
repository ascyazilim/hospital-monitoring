package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToOne(mappedBy = "userRole", cascade = CascadeType.ALL)
    private Admin admin;

    @OneToOne(mappedBy = "userRole", cascade = CascadeType.ALL)
    private Doktor doktor;

    @OneToOne(mappedBy = "userRole", cascade = CascadeType.ALL)
    private Hemsire hemsire;

}
