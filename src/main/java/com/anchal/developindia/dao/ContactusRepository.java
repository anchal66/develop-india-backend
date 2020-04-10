package com.anchal.developindia.dao;

import com.anchal.developindia.entity.Contactus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ContactusRepository extends JpaRepository<Contactus, Long> {

}
