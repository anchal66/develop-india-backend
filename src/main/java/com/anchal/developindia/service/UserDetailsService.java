package com.anchal.developindia.service;

import com.anchal.developindia.dao.AuthRepository;
import com.anchal.developindia.entity.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    private AuthRepository authRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        System.out.println("AUTH :  "+username);
        Auth user = authRepository.findByEmail(username);
        System.out.println("AUTH :  "+user.getEmail() +" "+ user.getPassword());
        return new User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }
}
