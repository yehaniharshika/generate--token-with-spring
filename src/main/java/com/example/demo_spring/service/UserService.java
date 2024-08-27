package com.example.demo_spring.service;

import com.example.demo_spring.dto.UserDTO;

public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String username);
}
