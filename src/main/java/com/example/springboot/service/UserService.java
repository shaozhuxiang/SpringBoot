// src/main/java/com/example/springboot/service/UserService.java

package com.example.springboot.service;

import com.example.springboot.entity.User;
import com.example.springboot.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        logger.info("Fetching");
        return userRepository.findAll();
    }

    public List<User> findByNameAndEmailAndAge(User user) {
        return userRepository.findByNameAndEmailAndAge(user.getName(),user.getEmail(),user.getAge());
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
