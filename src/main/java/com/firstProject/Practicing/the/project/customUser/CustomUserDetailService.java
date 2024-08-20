//package com.firstProject.Practicing.the.project.customUser;
//
//import com.firstProject.Practicing.the.project.entity.Set;
//import com.firstProject.Practicing.the.project.repository.SetRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//    @Autowired
//    private SetRepository setRepository;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Set user = setRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("username not found: " + username));
//        return new CustomUserDetails(user);
//    }
//}
