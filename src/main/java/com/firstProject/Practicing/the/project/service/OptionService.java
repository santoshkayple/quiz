//package com.firstProject.Practicing.the.project.service;
//
//import com.firstProject.Practicing.the.project.entity.Option;
//import com.firstProject.Practicing.the.project.repository.OptionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class OptionService {
//
//    @Autowired
//    private OptionRepository optionRepository;
//
//    public List<Option> getAllOptions() {
//
//        return optionRepository.findAll();
//    }
//
//    public Optional<Option> getOptionById(Long id) {
//        return optionRepository.findById(id);
//    }
//
//    public Option createOption(Option option) {
//        return optionRepository.save(option);
//    }
////    public Option updateOption(Option option) {
////        return optionRepository.save(option);
////    }
//    public void deleteOptionById(Long id) {
//        optionRepository.deleteById(id);
//    }
//}
