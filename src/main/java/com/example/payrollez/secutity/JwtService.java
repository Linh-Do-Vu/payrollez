package com.example.payrollez.secutity;//package com.example.payrollezhcm2.secutity;
//
//import io.jsonwebtoken.*;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//public class JwtService {
//    private static final String SECRET_KEY = "123456789987654321123456789987654321123456789";
//    private static final long EXPIRE_TIME = 86400000000L;
//    private static final String SECRET_KEY_REFRESH_TOKEN ="1234512389987654321123456789987654321123456789";
//
//    /**
//     * Tạo mã token
//     * @paramauthentication
//     * @return mã token
//     */
//
//    /**
//     * Kiểm tra tính hợp lệ của token
//     * @paramauthToken : token
//     * @return
//     */
//    public boolean validateJwtToken(String authToken) {
//        try {
//            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(authToken);
//            return true;
//        } catch (MalformedJwtException e) {
//            System.out.println("Invalid JWT token -> Message: "+ e.getMessage());
//        } catch (ExpiredJwtException e) {
//            System.out.println("Expired JWT token -> Message: "+ e.getMessage());
//        } catch (UnsupportedJwtException e) {
//            System.out.println("Unsupported JWT token -> Message: "+ e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println("JWT claims string is empty -> Message: "+ e.getMessage());
//        }
//        return false;
//    }
//    /**
//     * Lấy username từ 1 token
//     * @paramtoken : là 1 token
//     * @return :
//     */
//
//    public String getUserNameFromJwtToken(String token) {
//        String userName = Jwts.parser()
//                .setSigningKey(SECRET_KEY)
//                .parseClaimsJws(token)
//                .getBody().getSubject();
//        return userName;
//    }
//}
