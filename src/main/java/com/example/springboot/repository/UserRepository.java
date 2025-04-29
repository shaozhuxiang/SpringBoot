// src/main/java/com/example/springboot/repository/UserRepository.java

package com.example.springboot.repository;

import com.example.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    List<User> findByNameAndEmailAndAge(String name, String email, int age);
    List<User> findByNameLike(String name);
}
