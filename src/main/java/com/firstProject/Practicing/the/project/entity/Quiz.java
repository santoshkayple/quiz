package com.firstProject.Practicing.the.project.entity;

import jakarta.persistence.*;
import java.util.*;

import lombok.*;
import lombok.experimental.SuperBuilder;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Table(name = "quiz")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Getter
@Setter
public class Quiz extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    private String answer;
    private String wrong;

    @ManyToOne
    @JoinColumn(name = "quiz_unit_id")
    private QuizUnit quizUnit;

    @ManyToOne
    @JoinColumn(name = "quiz_set_id")
    private QuizSet quizSet;


}
