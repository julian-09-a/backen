package com.betabyte.back.users;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping
    ArrayList<Usermodel> findAll() {
        return usersService.findAll();
    }

    @PostMapping
    public Usermodel save(@RequestBody Usermodel usermodel) {
        return usersService.save(usermodel);
    }

    @GetMapping("/{id}")
    public Usermodel findById(@RequestParam Long id) {
        return usersService.findById(id);
    }

    @PatchMapping("/{id}")
    public Usermodel update(@RequestParam Long id, @RequestBody Usermodel usermodel) {
        return usersService.update(id, usermodel);
    }

    @DeleteMapping ("/{id}")
    public Usermodel delete(@RequestParam Long id) {
        return usersService.delete(id);
    }


}
