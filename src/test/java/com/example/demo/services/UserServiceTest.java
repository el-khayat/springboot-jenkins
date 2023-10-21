package com.example.demo.services;

import com.example.demo.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
@AllArgsConstructor
class UserServiceTest {

    @Mock
    private UserRepository userRepository ;
    private final UserService userTest ;
    private AutoCloseable  autoCloseable ;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception{
        autoCloseable.close();
    }

    @Test
    void add() {
    }

    @Test
    void update() {
    }

    @Test
    @Disabled
    void delete() {
    }

    @Test
    void getAll() {

//        when


//        then
//        verify(userRepository).findAll();
    }

    @Test
    void getOne() {
    }
}