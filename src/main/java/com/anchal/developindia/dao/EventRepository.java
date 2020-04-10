package com.anchal.developindia.dao;

import com.anchal.developindia.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface EventRepository extends JpaRepository<Events, Long> {

}
