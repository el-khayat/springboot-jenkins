package com.example.demo.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content ;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user ;
//
//    @ManyToOne
//    private Post post ;
}
