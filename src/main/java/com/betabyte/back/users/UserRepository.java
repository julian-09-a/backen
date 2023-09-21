package com.betabyte.back.users;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usermodel, Long> {

    Usermodel findByEmail(String email);

}
