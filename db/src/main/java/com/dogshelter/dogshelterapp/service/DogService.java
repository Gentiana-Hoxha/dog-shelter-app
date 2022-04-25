
package com.dogshelter.dogshelterapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dogshelter.dogshelterapp.exception.DogNotFoundException;
import com.dogshelter.dogshelterapp.model.Dog;
import com.dogshelter.dogshelterapp.repo.DogRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class DogService {
    private final DogRepository DogRepo;

    @Autowired
    public DogService(DogRepository DogRepo) {
        this.DogRepo = DogRepo;
    }

    public Dog addDog(Dog Dog) {
        Dog.setDogCode(UUID.randomUUID().toString());
        return DogRepo.save(Dog);
    }

    public List<Dog> findAllDogs() {
        return DogRepo.findAll();
    }

    public Dog updateDog(Dog Dog) {
        return DogRepo.save(Dog);
    }

    public Dog findDogById(Long id) {
        return DogRepo.findDogById(id)
                .orElseThrow(() -> new DogNotFoundException("Dog by id " + id + " was not found"));
    }

    public void deleteDog(Long id){
        DogRepo.deleteDogById(id);
    }
}