package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.User;
import com.birkil.hospitalmonitoring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }
    
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
