package com.betabyte.back.users;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    UserRepository userRepository;

    ArrayList<Usermodel> findAll() {
        return (ArrayList<Usermodel>) userRepository.findAll();
    }

    Usermodel save(Usermodel usermodel) {
        return userRepository.save(usermodel);
    }

    Usermodel findById(Long id) {
        return userRepository.findById(id).get();
    }

    void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    Usermodel findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    Usermodel update(Long id, Usermodel user){
        Usermodel userForUpdate = userRepository.findById(id).get();
        if (user.getEmail() != null) {
            userForUpdate.setEmail(user.getEmail());
        }

        if (user.getPassword() != null) {
            userForUpdate.setPassword(user.getPassword());
        }

        return userRepository.save(userForUpdate);
    }

    public Usermodel delete(Long id) {
        Usermodel user = userRepository.findById(id).orElse(null);
        if (user != null) {
            return null;
        }
        userRepository.deleteById(id);
        return user;
    }
}
