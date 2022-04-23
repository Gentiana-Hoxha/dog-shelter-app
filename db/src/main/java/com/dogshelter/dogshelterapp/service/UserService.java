
package com.dogshelter.dogshelterapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dogshelter.dogshelterapp.exception.UserNotFoundException;
import com.dogshelter.dogshelterapp.model.User;
import com.dogshelter.dogshelterapp.repo.UserRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserService {
    private final UserRepository UserRepo;

    @Autowired
    public UserService(UserRepository UserRepo) {
        this.UserRepo = UserRepo;
    }

    public User addUser(User User) {
        User.setUserCode(UUID.randomUUID().toString());
        return UserRepo.save(User);
    }

    public List<User> findAllUsers() {
        return UserRepo.findAll();
    }

    public User updateUser(User User) {
        return UserRepo.save(User);
    }

    public User findUserById(Long id) {
        return UserRepo.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteUser(Long id){
        UserRepo.deleteUserById(id);
    }
}