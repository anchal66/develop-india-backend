package com.anchal.developindia;

import com.anchal.developindia.dao.AuthRepository;
import com.anchal.developindia.entity.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DevelopIndiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevelopIndiaApplication.class, args);
    }

}
