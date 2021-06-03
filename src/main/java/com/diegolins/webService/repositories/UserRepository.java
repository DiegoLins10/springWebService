package com.diegolins.webService.repositories;

/*
 * @Author Diego Lins 03/06/21
 * CRIACAO interface user repository 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegolins.webService.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
