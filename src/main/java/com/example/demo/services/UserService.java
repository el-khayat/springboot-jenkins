package com.example.demo.services;

import com.example.demo.entites.User;
import com.example.demo.exceptions.AppException;
import com.example.demo.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//@NoArgsConstructor
@Service
public class UserService  {

    private UserRepository userRepository;

    private  PasswordEncoder passwordEncoder;


}