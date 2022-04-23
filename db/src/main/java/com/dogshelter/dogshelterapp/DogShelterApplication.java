package com.dogshelter.dogshelterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogShelterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogShelterApplication.class, args);
		System.out.println("============================================================= \n ITS WORKING!");
	}

}
