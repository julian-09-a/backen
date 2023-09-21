package com.betabyte.back.admins;

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
@RequestMapping("admins")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping
    ArrayList<AdminModel> findAll() {
        return this.adminService.findAll();
    }

    @PostMapping
    AdminModel save(AdminModel adminsModel) {
        return adminService.save(adminsModel);
    }

    @GetMapping("/{id}")
    public AdminModel findById(@RequestParam Long id) {
        return adminService.findById(id);
    }

    @PatchMapping("/{id}")
    public AdminModel update(@RequestParam Long id, @RequestBody AdminModel adminsModel) {
        return this.adminService.update(id, adminsModel);
    }

    @DeleteMapping("/{id}")
    public AdminModel delete(@RequestParam Long id) {
        return adminService.delete(id);
    }
}
