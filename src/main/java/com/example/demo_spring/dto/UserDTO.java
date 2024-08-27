package com.example.demo_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private String email;
    private String password;
    private String name;
    private String companyName;
    private String role;
}
