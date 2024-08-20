package com.firstProject.Practicing.the.project.repository;

import com.firstProject.Practicing.the.project.entity.QuizUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuizUnitRepository extends JpaRepository<QuizUnit, Long> {

}
