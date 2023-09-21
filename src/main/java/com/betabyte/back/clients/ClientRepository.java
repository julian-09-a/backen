package com.betabyte.back.clients;

import org.springframework.data.repository.CrudRepository;


public interface ClientRepository extends CrudRepository<ClientModel, Long>{

    ClientModel deleteByDni(Long dni);


}

