package com.firstProject.Practicing.the.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quize")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Question;

    @ManyToMany
    @JoinTable(name = "unit_id")
    private Unit unit;

}
