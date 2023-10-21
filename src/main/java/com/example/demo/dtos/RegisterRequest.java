package com.example.demo.dtos;

import com.example.demo.entites.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String phone;
    private String address;
    private String image;
    private String email;
    private String password;
    private Role role;
}
