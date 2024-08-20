package com.firstProject.Practicing.the.project.repository;

import com.firstProject.Practicing.the.project.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
