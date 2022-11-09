package com.gagarin.bankAPI.service;

import com.gagarin.bankAPI.entity.User;
import com.gagarin.bankAPI.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}