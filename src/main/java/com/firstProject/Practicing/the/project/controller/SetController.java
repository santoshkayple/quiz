package com.firstProject.Practicing.the.project.controller;

import com.firstProject.Practicing.the.project.entity.Set;
import com.firstProject.Practicing.the.project.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("auth/sets")
public class SetController {
    @Autowired
    private SetService setService;

    @GetMapping
    public List<Set> getAllSets(){
        return setService.getAllSets();
    }

    @GetMapping("/{id}")
    public Optional<Set> getSetById(@PathVariable Long id){
        return setService.getSetById(id);
    }

    @PostMapping
    public Set createSet(@RequestBody Set set){
        return setService.createSet(set);
    }

    @DeleteMapping("/{id}")
    public void deleteSet(@PathVariable Long id){
        setService.deleteSet(id);
    }

}
