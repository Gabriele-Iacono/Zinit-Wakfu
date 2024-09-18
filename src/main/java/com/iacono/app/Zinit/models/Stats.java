package com.iacono.app.Zinit.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer value;

    @ManyToOne
    private Item itemId;

    @ManyToOne
    private TypeStat typeStatId;
}
