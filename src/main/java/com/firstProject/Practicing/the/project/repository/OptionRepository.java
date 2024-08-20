package com.firstProject.Practicing.the.project.repository;

import com.firstProject.Practicing.the.project.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {
}
