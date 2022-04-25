package com.dogshelter.dogshelterapp.recource;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dogshelter.dogshelterapp.model.Dog;
import com.dogshelter.dogshelterapp.service.DogService;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogResource {
    private final DogService DogService;

    public DogResource(DogService DogService) {
        this.DogService = DogService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Dog>> getAllDogs () {
        List<Dog> Dogs = DogService.findAllDogs();
        return new ResponseEntity<>(Dogs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Dog> getDogById (@PathVariable("id") Long id) {
        Dog Dog = DogService.findDogById(id);
        return new ResponseEntity<>(Dog, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Dog> addDog(@RequestBody Dog Dog) {
        Dog newDog = DogService.addDog(Dog);
        return new ResponseEntity<>(newDog, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Dog> updateDog(@RequestBody Dog Dog) {
        Dog updateDog = DogService.updateDog(Dog);
        return new ResponseEntity<>(updateDog, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDog(@PathVariable("id") Long id) {
        DogService.deleteDog(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}