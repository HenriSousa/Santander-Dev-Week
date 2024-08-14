package me.dio.santander_dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.santander_dev.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
