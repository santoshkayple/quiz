package com.firstProject.Practicing.the.project.service;

import com.firstProject.Practicing.the.project.entity.Option;
import com.firstProject.Practicing.the.project.entity.Quiz;
import com.firstProject.Practicing.the.project.repository.OptionRepository;
import com.firstProject.Practicing.the.project.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private OptionRepository optionRepository;

    public List<Quiz> getAllQuizzes(){
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }


    public void deleteQuiz(Long id) {
        quizRepository.deleteById(id);
    }

    public boolean checkAnswer(Long optionId) {
        Option option = optionRepository.findById(optionId).orElse(null);
        return option != null && option.isCorrectAnswer();
    }
}
