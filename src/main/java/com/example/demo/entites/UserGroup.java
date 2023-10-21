package com.example.demo.entites;


import jakarta.persistence.*;

@Entity
@Table(name = "user_group")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "group_id")
//    private Group group;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    @Enumerated(EnumType.STRING)
    private Role role;
    // Constructors, getters, and setters

}
