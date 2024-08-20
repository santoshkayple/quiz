package com.firstProject.Practicing.the.project.repository;

import com.firstProject.Practicing.the.project.entity.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SetRepository extends JpaRepository<Set, Long> {

//    Optional<Set> findByUsername(String username);
}
