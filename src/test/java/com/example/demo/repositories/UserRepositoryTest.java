package com.example.demo.repositories;

import com.example.demo.entites.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository underTest ;

    @Test
    void save(){
        // craete
        User user  = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("12345678");
        user.setFirstName("mohamed");
        user.setLastName("elkhayat");
        //save
        User newUser = underTest.save(user);
        // loge
        System.out.println(newUser);

    }

    @Test
    void getOne(){
        User user = underTest.findById(1L).get();

        System.out.println(user);

        assertThat(user).isEqualTo(user);
    }
}