package com.betabyte.back.superadmin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperAdminService {
    @Autowired
    SuperAdminRepository SuperAdminRepository;

    ArrayList<SuperAdminModel> findAll() {
        return (ArrayList<SuperAdminModel>) SuperAdminRepository.findAll();
    }

    SuperAdminModel save(SuperAdminModel SuperAdminModel) {
        return SuperAdminRepository.save(SuperAdminModel);
    }

    SuperAdminModel findById(Long id) {
        return SuperAdminRepository.findById(id).get();
    }

    void deleteById(Long id) {
        SuperAdminRepository.deleteById(id);
    }

    SuperAdminModel update(Long id, SuperAdminModel SuperAdmin){
        SuperAdminModel SuperAdminForUpdate = SuperAdminRepository.findById(id).get();
    
        if (SuperAdmin.getName() != null) {
            SuperAdminForUpdate.setName(SuperAdmin.getName());
        }

        return SuperAdminRepository.save(SuperAdminForUpdate);
    }

    public SuperAdminModel delete(Long id) {
        SuperAdminModel SuperAdmin = SuperAdminRepository.findById(id).orElse(null);
        if (SuperAdmin != null) {
            SuperAdminRepository.deleteById(id);
        }
        SuperAdminRepository.deleteById(id);
        return SuperAdmin ;
    }
      


}
