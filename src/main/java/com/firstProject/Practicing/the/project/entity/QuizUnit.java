package com.firstProject.Practicing.the.project.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Table(name = "quiz_unit")
@SuperBuilder
@AllArgsConstructor(access = PRIVATE)
@NoArgsConstructor(access = PROTECTED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Getter
@Setter
public class QuizUnit extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "quiz_set_id")
    private QuizSet quizSet;

    @OneToMany(mappedBy = "quizUnit", cascade = CascadeType.ALL)
    private List<Quiz> quizList = new ArrayList<>();

    public void addQuiz() {
        quizList.forEach(quiz -> quiz.setQuizUnit(this));
    }
}
