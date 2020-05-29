package com.anchal.developindia.controllers;

import com.anchal.developindia.entity.AuthRequest;
import com.anchal.developindia.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class StartRestController {

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/test")
    public String startapp(){
        System.out.println("Start APP");
        return "hello";
    }

    @PostMapping("/auth")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception{
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
            );
        }catch (Exception e){
            throw new Exception("invalid userbame and password");
        }
        return jwtUtil.generateToken(authRequest.getUsername());
    }
}
