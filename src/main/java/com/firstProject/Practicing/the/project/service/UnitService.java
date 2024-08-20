package com.firstProject.Practicing.the.project.service;

import com.firstProject.Practicing.the.project.entity.Unit;
import com.firstProject.Practicing.the.project.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitService {
    @Autowired
    private UnitRepository unitRepository;

    public List<Unit> getAllUnits(){
        return unitRepository.findAll();
    }

    private Optional<Unit> getUnitById(Long id){
        return unitRepository.findById(id);
    }

    private Unit createUnit(Unit unit){
        return unitRepository.save(unit);
    }

//    private Unit updateUnit(Unit unit){
//        return unitRepository.save(unit);
//    }

    private Unit deleteUnit(Long id){
        Unit unit = getUnitById(id).orElse(null);
        unitRepository.delete(unit);
        return unit;
    }
}
