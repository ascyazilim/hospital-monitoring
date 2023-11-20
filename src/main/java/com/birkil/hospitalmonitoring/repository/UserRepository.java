package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
