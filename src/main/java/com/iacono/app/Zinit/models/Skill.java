package com.iacono.app.Zinit.models;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "skills") // Nome della tabella skills nel database
@Data

public class Skill {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private Element element;
    @Column(name = "passive")
    private boolean isPassive; // passiva non passiva
// tante skill, un personaggio
    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character characterId;
}

