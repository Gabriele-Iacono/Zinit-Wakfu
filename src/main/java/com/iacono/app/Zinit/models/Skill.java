package com.iacono.app.Zinit.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity

@Data

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @ManyToOne
    private Character characterId;

}
