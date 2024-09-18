package com.iacono.app.Zinit.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
// HP LOCK DODGE
public class TypeStat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namestat;

    @OneToMany
    private List<Stats> stats;
}
