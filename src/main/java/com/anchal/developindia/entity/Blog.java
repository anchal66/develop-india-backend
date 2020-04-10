package com.anchal.developindia.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="blogs")
@Data
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "blog")
    private String blog;

    @Column(name = "img_url")
    private String imgUrl;
}
