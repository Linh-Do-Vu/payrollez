package com.example.payrollez.secutity;

//import com.appsdeveloperblog.photoapp.api.users.service.UsersService;
//import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;
//import com.appsdeveloperblog.photoapp.api.users.ui.model.LoginRequestModel;
import com.example.payrollez.model.user.CoreUserAccount;
import com.example.payrollez.service.core_user_account.ICoreUserAccountService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private final ICoreUserAccountService usersService;
    private final Environment environment;


    public AuthenticationFilter(AuthenticationManager authenticationManager, Environment environment, ICoreUserAccountService usersService) {
       super(authenticationManager);
        this.usersService = usersService;
        this.environment = environment;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        try {
//            LoginRequestModel creds = new ObjectMapper().readValue(request.getInputStream(), LoginRequestModel.class);
//            return getAuthenticationManager().authenticate
//                    (new UsernamePasswordAuthenticationToken(creds.getEmail(), creds.getPassword(), new ArrayList<>()));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
return null ;
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult)
            throws IOException, ServletException {
        String userName = ((User) authResult.getPrincipal()).getUsername();
        CoreUserAccount userDetails = usersService.findCoreUserAccountByUsername(userName);
        String tokenSecret = environment.getProperty("token.secret");
        byte[] secretKeyBytes = Base64.getEncoder().encode(tokenSecret.getBytes());
        SecretKey secretKey = new SecretKeySpec(secretKeyBytes, SignatureAlgorithm.HS512.getJcaName());

        Instant now = Instant.now();

        String token = Jwts.builder().setSubject(userDetails.getUserAccountId().toString())
                .setExpiration(
                        Date.from(now.plusMillis(Long.parseLong(environment.getProperty("token.expiration_time")))))
                .setIssuedAt(Date.from(now)).signWith(secretKey, SignatureAlgorithm.HS512).compact();

        response.addHeader("token", token);
        response.addHeader("userId", userDetails.getUserAccountId().toString());

    }
}
