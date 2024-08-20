package com.firstProject.Practicing.the.project.controller;

import com.firstProject.Practicing.the.project.entity.QuizUnit;
import com.firstProject.Practicing.the.project.service.QuizUnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/quiz_unit")
public class QuizUnitController {

    private final QuizUnitService quizUnitService;

    @GetMapping
    public List<QuizUnit> getQuizUnitList(){
        return quizUnitService.getQuizUnitList();

    }

    @GetMapping("/{id}")
    public Optional<QuizUnit> getQuizUnitById(@PathVariable Long id){
        return quizUnitService.getQuizUnitDetails(id);
    }

    @PostMapping
    public QuizUnit createQuizUnit(@RequestBody QuizUnit quizUnit){
        return quizUnitService.createQuizUnit(quizUnit);
    }

    @PutMapping("/{id}")
    public QuizUnit updateQuizUnit(@PathVariable Long id, @RequestBody QuizUnit quizUnit){
        return quizUnitService.updateQuizUnit(id, quizUnit);
    }

    @DeleteMapping("/{id}")
    public void deleteQuizUnit(@PathVariable Long id){
        quizUnitService.deleteQuizUnit(id);
    }
}
