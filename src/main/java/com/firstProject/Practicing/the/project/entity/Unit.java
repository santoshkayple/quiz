package com.firstProject.Practicing.the.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "unit")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String order;
    private String title;

    @ManyToOne
    @JoinColumn(name = "set_id")
    private Set set;

    @OneToMany(mappedBy = "unit", cascade = CascadeType.ALL)
    private List<Quiz> quizList;


}
