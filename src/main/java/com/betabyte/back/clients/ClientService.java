package com.betabyte.back.clients;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService{
    @Autowired
    private ClientRepository clientRepository;

    ArrayList<ClientModel> findAll(){
        return (ArrayList<ClientModel>) clientRepository.findAll();
    }

    ClientModel save(ClientModel clientModel){
        return clientRepository.save(clientModel);
    }

    ClientModel findById(Long id){
        return clientRepository.findById(id).get();
    }

    void deleteById(Long id){
        clientRepository.deleteById(id);
    }

    ClientModel deleteByDni(Long dni){
        return clientRepository.deleteByDni(dni);
    }

    ClientModel update(Long id, ClientModel clientmodel){
        ClientModel clientModelForUpdate = clientRepository.findById(id).get();
        
        if (clientmodel.getName() != null){
            clientModelForUpdate.setName(clientmodel.getName());
        }

        if (clientmodel.getAge() != 0){
            clientModelForUpdate.setAge(clientmodel.getAge());
        }

        if (clientmodel.getPhone() != null){
            clientModelForUpdate.setPhone(clientmodel.getPhone());
        }

        if (clientmodel.getCity() != null){
           clientModelForUpdate.setCity(clientmodel.getCity());
        } 

        if (clientmodel.getAddress() != null){
            clientModelForUpdate.setAddress(clientmodel.getAddress());
        }

        return clientRepository.save(clientModelForUpdate);
    }

    public ClientModel delete(Long id){
        ClientModel clientModel = clientRepository.findById(id).orElse(null);
        if (clientModel != null){
        clientRepository.deleteById(id);
        }
        clientRepository.deleteById(id);
        return clientModel;

    }

}