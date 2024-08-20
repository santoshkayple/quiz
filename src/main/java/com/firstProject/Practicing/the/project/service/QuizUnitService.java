package com.firstProject.Practicing.the.project.service;

import com.firstProject.Practicing.the.project.entity.QuizUnit;
import com.firstProject.Practicing.the.project.repository.QuizUnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuizUnitService {

    private final QuizUnitRepository quizUnitRepository;

    public List<QuizUnit> getQuizUnitList(){
        return quizUnitRepository.findAll();
    }

    public Optional<QuizUnit> getQuizUnitDetails(Long id){
        return quizUnitRepository.findById(id);
    }

    public QuizUnit createQuizUnit(QuizUnit quizUnit){
        quizUnit.addQuiz();
        return quizUnitRepository.save(quizUnit);
    }

    public QuizUnit updateQuizUnit(Long id, QuizUnit quizUnit){
        QuizUnit quizUnitToUpdate = quizUnitRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz Unit not found"));

        quizUnitToUpdate.setTitle(quizUnit.getTitle());
        return quizUnitToUpdate;
    }

    public void deleteQuizUnit(Long id){
        quizUnitRepository.deleteById(id);

    }
}
