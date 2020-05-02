package com.anchal.developindia.dao;

import com.anchal.developindia.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CommentRepository extends JpaRepository <Comment, Long> {
}
