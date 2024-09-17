package com.iacono.app.Zinit.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Slot slotId;
    private String name;

    @OneToMany
    private List<Stat> stats;

}
