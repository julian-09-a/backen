package com.betabyte.back.ordenes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenesService {
    @Autowired
    OrdenesRepository ordersRepository;

    public ArrayList<OrdenesModel> findAll() {
        return (ArrayList<OrdenesModel>) ordersRepository.findAll();

    }

    public OrdenesModel save(OrdenesModel ordenesModel) {
        return ordersRepository.save(ordenesModel);
    }

    OrdenesModel findById(Long id) {
        return ordersRepository.findById(id).get();
    }

    void deleteById(Long id) {
        ordersRepository.deleteById(id);
    }

    OrdenesModel update(Long id, OrdenesModel ordenesModel) {
        OrdenesModel ordenesForUpdate = ordersRepository.findById(id).get();

        if (ordenesModel.getName_product() != null) {
            ordenesForUpdate.setName_product(ordenesModel.getName_product());
        }

        if (ordenesModel.getPrice() != 0){
            ordenesForUpdate.setPrice(ordenesModel.getPrice());
        }

        if (ordenesModel.getState() != null){
            ordenesForUpdate.setState(ordenesModel.getState());
        }

        return ordersRepository.save(ordenesForUpdate);
    }

    public OrdenesModel delete(Long id) {
        OrdenesModel ordenesModel = ordersRepository.findById(id).orElse(null);
        if (ordenesModel != null) {
            ordersRepository.deleteById(id);
        }
        ordersRepository.deleteById(id);
        return ordenesModel;
    }

}
