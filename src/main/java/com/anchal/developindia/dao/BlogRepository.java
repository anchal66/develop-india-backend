package com.anchal.developindia.dao;

import com.anchal.developindia.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface BlogRepository extends JpaRepository <Blog, Long> {
}
