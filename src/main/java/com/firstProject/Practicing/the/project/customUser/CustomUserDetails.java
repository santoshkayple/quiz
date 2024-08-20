//package com.firstProject.Practicing.the.project.customUser;
//
//import com.firstProject.Practicing.the.project.entity.Set;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//
//@Getter
//@Setter
//public class CustomUserDetails implements UserDetails {
//
//
//    private  final Set set;
//    public CustomUserDetails(Set set) {
//        this.set = set;
//    }
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return set.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return set.getUsername();
//    }
//}
