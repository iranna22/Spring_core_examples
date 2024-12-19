package com.iranna.annotaionAndJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor-based Dependency Injection
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserDetails(int id) {
        return userRepository.findUserById(id);
    }
}

