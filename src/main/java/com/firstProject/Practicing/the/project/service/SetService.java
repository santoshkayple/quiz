package com.firstProject.Practicing.the.project.service;

import com.firstProject.Practicing.the.project.entity.Set;
import com.firstProject.Practicing.the.project.repository.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SetService {
    @Autowired
    private SetRepository setRepository;

    public List<Set> getAllSets(){
        return setRepository.findAll();
    }

    public Optional<Set> getSetById(long id){
        return setRepository.findById(id);
    }

    public Set createSet(Set set){
        return setRepository.save(set);
    }
//    public Set updateSet(Long id, Set set){
//        return setRepository.save(set);
//    }
    public void deleteSet(long id){
        setRepository.deleteById(id);
    }


}
