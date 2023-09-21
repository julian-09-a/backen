package com.betabyte.back.ordenes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ordenes")
public class OrdenesController {
    @Autowired
    OrdenesService ordenesService;

    @GetMapping
    ArrayList<OrdenesModel> findAll() {
        return ordenesService.findAll();
    }

    @PostMapping
    public OrdenesModel save(OrdenesModel ordenesModel) {
        return ordenesService.save(ordenesModel);
    }

    @GetMapping("/{id}")
    public OrdenesModel findById(Long id) {
        return ordenesService.findById(id);
    }

    @PatchMapping("/{id}")
    public OrdenesModel update(Long id, OrdenesModel ordenesModel) {
        return ordenesService.update(id, ordenesModel);
    }

    @DeleteMapping("/{id}")
    public OrdenesModel delete(Long id) {
        return ordenesService.delete(id);
    }
}
