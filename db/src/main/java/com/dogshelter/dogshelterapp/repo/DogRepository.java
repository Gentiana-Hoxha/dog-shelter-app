package com.dogshelter.dogshelterapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.dogshelter.dogshelterapp.model.Dog;

import java.util.Optional;

public interface DogRepository extends JpaRepository<Dog, Long>{
    void deleteDogById(Long id);

    Optional<Dog> findDogById(Long id);
}
