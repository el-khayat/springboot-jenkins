package com.example.demo.services;

import com.example.demo.entites.Post;
import com.example.demo.repositories.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PostServiceTest {

    @Mock
    private PostRepository postRepository ;
    private PostService underTest ;

    @BeforeEach
    void setUp() {
        underTest = new PostService(postRepository);
    }

    @Test
    void getOne() {
    }

    @Test
    @Disabled
    void getAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }
    @Test
    void add() {
        Post post = new Post(1L,"cont1","image.png",0,null,null);

    underTest.add(post);

        ArgumentCaptor<Post> postArgumentCaptor = ArgumentCaptor.forClass(Post.class);

        verify(postRepository).save(postArgumentCaptor.capture());
        Post capturedPost = postArgumentCaptor.getValue();
        assertThat(post).isEqualTo(capturedPost);
    }

}