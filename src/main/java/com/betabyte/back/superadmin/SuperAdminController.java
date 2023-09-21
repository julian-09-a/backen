package com.betabyte.back.superadmin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("SuperAdmin")
public class SuperAdminController {
    @Autowired
    SuperAdminService superAdminService;

    @GetMapping
    ArrayList<SuperAdminModel> findAll() {
        return superAdminService.findAll();
    }

    @PostMapping 
    public SuperAdminModel save(SuperAdminModel superAdminModel) {
        return superAdminService.save(superAdminModel);
    }

    @GetMapping("/{id}")
    public SuperAdminModel findById(Long id) {
        return superAdminService.findById(id);
    }

    @PatchMapping("/{id}")
    public SuperAdminModel update(Long id, SuperAdminModel superAdminModel) {
        return superAdminService.update(id, superAdminModel);
    }

    @DeleteMapping ("/{id}")
    public SuperAdminModel delete(Long id) {
        return superAdminService.delete(id);
    }
}
