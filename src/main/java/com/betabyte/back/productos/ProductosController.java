package com.betabyte.back.productos;

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
@RequestMapping("products")
public class ProductosController {
    @Autowired
    ProductosService productosService;

    @GetMapping
    ArrayList<ProductosModel> findAll(){
        return productosService.findAll();
    }

    @PostMapping
    public ProductosModel save(ProductosModel productosModel){
        return productosService.save(productosModel);
    }

    @GetMapping("/{id}")
    public ProductosModel findById(@RequestParam Long id) {
        return productosService.findById(id);
    }

    @PatchMapping("/{id}")
    public ProductosModel update(@RequestParam Long id, @RequestBody ProductosModel productosModel) {
        return productosService.update(id, productosModel);
    }

    @DeleteMapping ("/{id}")
    public ProductosModel delete(@RequestParam Long id) {
        return productosService.delete(id);
    }
}
