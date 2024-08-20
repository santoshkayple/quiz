package com.firstProject.Practicing.the.project.service;


import com.firstProject.Practicing.the.project.entity.Quiz;
import com.firstProject.Practicing.the.project.repository.QuizRepository;
import com.firstProject.Practicing.the.project.req.CreateQuizReq;
import com.firstProject.Practicing.the.project.req.UpdateQuizReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepository;

    public List<Quiz> getAllQuiz(){
        return quizRepository.findAll().stream().collect(Collectors.toList());
    }

    public Quiz getQuizDetail(Long id) {
        return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("선택하신 퀴즈가 없습니다."));
    }
    @Transactional
    public Quiz createQuiz(CreateQuizReq req) {

        Quiz quiz = new Quiz();
        quiz.setTitle(req.title());
        quiz.setAnswer(req.answer());
        quiz.setWrong(req.wrong());

        return quizRepository.save(quiz);
    }
    @Transactional
    public Quiz updateQuiz(Long id, UpdateQuizReq req) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("선택하신 퀴즈가 없습니다."));
        quiz.setTitle(req.title());
        quiz.setAnswer(req.answer());
        quiz.setWrong(req.wrong());
        return quiz;
    }
    @Transactional
    public void deleteQuiz(Long id) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("선택하신 퀴즈가 없습니다."));
        quiz.delete();
    }

//    public boolean checkAnswer(Long optionId) {
//        Option option = optionRepository.findById(optionId).orElse(null);
//        return option != null && option.isCorrectAnswer();
//    }
}
