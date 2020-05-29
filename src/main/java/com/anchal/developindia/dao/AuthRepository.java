package com.anchal.developindia.dao;

import com.anchal.developindia.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface AuthRepository extends JpaRepository<Auth, Long> {

    Auth findByEmail(String email);
}
