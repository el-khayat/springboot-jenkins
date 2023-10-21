package com.example.demo.services;

import com.example.demo.entites.Post;
import com.example.demo.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class PostService {


    private PostRepository postRepository ;
    public Post getOne(Long id){
        return postRepository.findById(id).orElse(null);
    }
    public Collection<Post> getAll(){
        return postRepository.findAll();
    }
    public void deleteById(Long id){
         postRepository.deleteById(id);
    }
    public Post update(Post post){
        return postRepository.save(post);
    }
    public Post add(Post post){
        return postRepository.save(post);
    }

}
