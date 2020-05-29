package com.anchal.developindia;

import com.anchal.developindia.dao.AuthRepository;
import com.anchal.developindia.entity.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DevelopIndiaApplication {

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*").allowedHeaders("*").allowedOrigins("*")
                        .allowCredentials(true);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DevelopIndiaApplication.class, args);
    }

}
