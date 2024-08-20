package com.firstProject.Practicing.the.project.service;

import com.firstProject.Practicing.the.project.entity.QuizSet;

import com.firstProject.Practicing.the.project.repository.QuizSetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class QuizSetService {

    private final QuizSetRepository quizSetRepository;

    public List<QuizSet> getQuizSetLists(){
        return quizSetRepository.findAll();
    }

    public Optional<QuizSet> getQuizSetDetails(long id){
        return quizSetRepository.findById(id);
    }

    public QuizSet createQuizSet(QuizSet quizSet){
        return quizSetRepository.save(quizSet);
    }

    public QuizSet updateQuizSet(Long id, QuizSet quizSet){
        Optional<QuizSet> quizSetOptional = quizSetRepository.findById(id);
        if(quizSetOptional.isPresent()){
            QuizSet updatingQuizSet = quizSetOptional.get();
            updatingQuizSet.setGrade(quizSet.getGrade());
            updatingQuizSet.setSubject(quizSet.getSubject());
            updatingQuizSet.setTitle(quizSet.getTitle());
            updatingQuizSet.setSubTitle(quizSet.getSubTitle());
            return quizSetRepository.save(updatingQuizSet);
        }
        else {
            throw new RuntimeException("QuizSet not found");
        }

    }

    public void deleteQuizSet(long id){
        quizSetRepository.deleteById(id);
    }


}
