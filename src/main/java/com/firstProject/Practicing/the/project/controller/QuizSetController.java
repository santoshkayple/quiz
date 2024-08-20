package com.firstProject.Practicing.the.project.controller;

import com.firstProject.Practicing.the.project.entity.QuizSet;
import com.firstProject.Practicing.the.project.service.QuizSetService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/quiz-set")
@RequiredArgsConstructor
public class QuizSetController {

    private final QuizSetService quizSetService;

    @GetMapping
    public List<QuizSet> getQuizSetList(){
        return quizSetService.getQuizSetLists();
    }

    @GetMapping("/{id}")
    public Optional<QuizSet> getQuizSetById(@PathVariable Long id){
        return quizSetService.getQuizSetDetails(id);
    }

    @PostMapping
    public QuizSet createQuizSet(@RequestBody QuizSet quizSet){
        return quizSetService.createQuizSet(quizSet);
    }

    @PutMapping("/{id}")
    public QuizSet updateQuizSet(@PathVariable Long id, @RequestBody QuizSet quizSet){
        return quizSetService.updateQuizSet(id, quizSet);
    }
    @DeleteMapping("/{id}")
    public void deleteQuizSet(@PathVariable Long id){
        quizSetService.deleteQuizSet(id);
    }

}
