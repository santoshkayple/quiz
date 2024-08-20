package com.firstProject.Practicing.the.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Set {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String subject;
    private String grade;
    private String title;
    private String subTitle;

    @OneToMany (mappedBy = "set", cascade = CascadeType.ALL)
    private List<Unit> unit;
}
