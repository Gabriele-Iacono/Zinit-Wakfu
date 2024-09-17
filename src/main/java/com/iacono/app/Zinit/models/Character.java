package com.iacono.app.Zinit.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "characters") // Specifica il nome della tabella nel database
@Data
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "characterId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Skill> skills;
}
