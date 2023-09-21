package com.betabyte.back.productos;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductosService {
    @Autowired
    ProductosRepository productosRepository;

    ArrayList<ProductosModel> findAll(){
        return (ArrayList<ProductosModel>) productosRepository.findAll();
    }

    ProductosModel save(ProductosModel productosModel){
        return productosRepository.save(productosModel);
    }

    ProductosModel findById(Long id){
        return productosRepository.findById(id).get();
    }

    void deleteById(Long id){
        productosRepository.deleteById(id);
    }

    ProductosModel update(Long id, ProductosModel productosModel){
        ProductosModel productosForUpdate = productosRepository.findById(id).get();
        
        if (productosModel.getName() != null){
            productosForUpdate.setName(productosModel.getName());
        }

        if (productosModel.getDescription() != null){
            productosForUpdate.setDescription(productosModel.getDescription());
        }

        if (productosModel.getPrice()!= 0){
            productosForUpdate.setPrice(productosModel.getPrice());
        }
        return productosRepository.save(productosForUpdate);
    }

    public ProductosModel delete(Long id){
        ProductosModel productosModel = productosRepository.findById(id).orElse(null);
        if (productosModel != null){
        productosRepository.deleteById(id);
        }
        productosRepository.deleteById(id);
        return productosModel;
    }

}    
