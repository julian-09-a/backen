package com.betabyte.back.admins;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminsRepository;

    ArrayList<AdminModel> findAll() {
        return (ArrayList<AdminModel>) this.adminsRepository.findAll();
    }

    AdminModel save(AdminModel AdminsModel) {
        return adminsRepository.save(AdminsModel);
    }

    AdminModel findById(Long id) {
        return adminsRepository.findById(id).get();
    }

    void deleteById(Long id) {
        adminsRepository.deleteById(id);
    }

    AdminModel update(Long id, AdminModel AdminModel) {
        AdminModel adminModelForUpdate = adminsRepository.findById(id).get();

        if (AdminModel.getName() != null){
            adminModelForUpdate.setName(AdminModel.getName());
        }
        
        return adminsRepository.save(adminModelForUpdate);
    }

    public AdminModel delete(Long id) {
        AdminModel adminModel = adminsRepository.findById(id).orElse(null);
        if(adminModel != null){
            adminsRepository.deleteById(id);
        }
        adminsRepository.deleteById(id);
        return adminModel;
    }

}
