package com.dogshelter.dogshelterapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.dogshelter.dogshelterapp.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);
}