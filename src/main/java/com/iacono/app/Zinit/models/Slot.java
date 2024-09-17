package com.iacono.app.Zinit.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity

@Data
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; // HELMET

    @OneToMany
    private List<Item> items;
}


