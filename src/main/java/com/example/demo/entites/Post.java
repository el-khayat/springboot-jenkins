package com.example.demo.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Table(
        name = "posts"
)
@Data
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id ;
       private String content ;
       private String image ;
       private int likes ;

       @ManyToOne(fetch = FetchType.EAGER)
       private User user ;

       @OneToMany(fetch = FetchType.EAGER,mappedBy = "post")
       private List<Comment> comments ;

    public Post() {

    }
}
