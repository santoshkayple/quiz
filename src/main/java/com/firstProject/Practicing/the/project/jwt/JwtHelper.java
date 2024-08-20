//package com.firstProject.Practicing.the.project.jwt;
//
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.function.Function;
//
//@Component
//public class JwtHelper {
//    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
//    public static final String secret = "fjygerferslslijjkfleoarifefbdriugferui9eh0regreghReThiunHUR9EHrTGR95GNRrgrTG0EEW90FER4FHNGLJDRTGROQsrgiorgoers";
//
//    public String getUsernameFromToken(String token) {
//        return getClaimFromToken(token, Claims::getSubject);
//
//    }
//
//
//
//
//    public Date getExpirationDateFromToken(String token) {
//        return getClaim
//    }
//
//    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver){
//
//    }
//
//    public Clmais getAllClaimsFromToken(String token) {
//        return Jwts.parser()
//                .setSigningKey(secret)
//                .parseClaimsJws(token)
//    }
//}
