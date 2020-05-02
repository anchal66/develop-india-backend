package com.anchal.developindia.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comment")
@Getter
@Setter
public class Comment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "comment_id")
        private Long commentId;

        @Column(name = "comment")
        private String comment;

        @ManyToOne
        @JoinColumn(name = "blogs_id")
        private Blog blog;

}
