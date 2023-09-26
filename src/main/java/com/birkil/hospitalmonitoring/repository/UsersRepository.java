package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
