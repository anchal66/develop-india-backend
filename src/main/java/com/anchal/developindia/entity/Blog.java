package com.anchal.developindia.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="blogs")
@Data
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "blog")
    private Set<Comment> comment;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Lob
    @Column(name = "blog")
    private String blog;

    @Column(name = "img_url", length = 500)
    private String imgUrl;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
}
