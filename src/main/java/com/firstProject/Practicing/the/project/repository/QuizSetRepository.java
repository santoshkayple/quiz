package com.firstProject.Practicing.the.project.repository;

import com.firstProject.Practicing.the.project.entity.QuizSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizSetRepository extends JpaRepository<QuizSet, Long> {

//    Optional<Set> findByUsername(String username);
}
