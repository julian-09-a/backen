package com.betabyte.back.clients;

import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("Clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public ArrayList<ClientModel> findAll() {
        return clientService.findAll();
    }

    @PostMapping
    ClientModel save(ClientModel clientModel) {
        return clientService.save(clientModel);
    }

    @GetMapping("/{id}")
    public ClientModel findById(@RequestParam Long id){
        return clientService.findById(id);
    }

    @PatchMapping("/{id}")
    public ClientModel update(@RequestParam Long id, @RequestBody ClientModel clientModel){
        return clientService.update(id, clientModel);
    }

    @DeleteMapping("/{id}")
    public ClientModel delete(@RequestParam Long id){
        return clientService.delete(id);
    }
}
