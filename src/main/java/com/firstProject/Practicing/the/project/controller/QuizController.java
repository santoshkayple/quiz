package com.firstProject.Practicing.the.project.controller;

import com.firstProject.Practicing.the.project.entity.Quiz;
import com.firstProject.Practicing.the.project.req.CreateQuizReq;
import com.firstProject.Practicing.the.project.req.UpdateQuizReq;
import com.firstProject.Practicing.the.project.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @GetMapping
    public ResponseEntity<List<Quiz>> getAllQuiz(){
        List<Quiz> quizList = quizService.getAllQuiz();
        return ResponseEntity
                .ok()
                .body(quizList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quiz> getQuizDetail(@PathVariable("id") Long id){
        Quiz quiz = quizService.getQuizDetail(id);
        return ResponseEntity
                .ok()
                .body(quiz);
    }

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestBody CreateQuizReq req) {
        Quiz quiz = quizService.createQuiz(req);
        return ResponseEntity
                .ok()
                .body(quiz);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Quiz> updateQuiz(@PathVariable("id") Long id, @RequestBody UpdateQuizReq req) {
        Quiz quiz = quizService.updateQuiz(id, req);
        return ResponseEntity
                .ok()
                .body(quiz);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuiz(@PathVariable("id") Long id) {
        quizService.deleteQuiz(id);
        return ResponseEntity
                .ok()
                .build();
    }

}
