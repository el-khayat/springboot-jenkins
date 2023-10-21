package com.example.demo.entites;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "group")
    private List<UserGroup> groups= new ArrayList<>();
}
