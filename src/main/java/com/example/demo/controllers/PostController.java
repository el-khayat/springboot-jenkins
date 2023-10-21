package com.example.demo.controllers;


import com.example.demo.entites.Post;
import com.example.demo.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {

    PostService postService ;
    @GetMapping
    public Collection<Post> getAll(){
        return postService.getAll();
    }
    @GetMapping("{id}")
    public Post getOne(@RequestParam Long id){
        return postService.getOne(id);
    }
    @DeleteMapping("{id}")
    public void delete(@RequestParam Long id){
        postService.deleteById(id);
    }
    @PostMapping
    public Post add(@RequestBody Post post){
        return postService.add(post);
    }
    @PostMapping("{id}")
    public Post delete(@RequestParam Post post){
        return postService.add(post);
    }
    @PostMapping("{id}")
    public Post update(@RequestParam Post post){
        return postService.update(post);
    }

}
