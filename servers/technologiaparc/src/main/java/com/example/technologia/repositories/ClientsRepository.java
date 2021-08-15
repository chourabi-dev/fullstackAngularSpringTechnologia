package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.Client;

public interface ClientsRepository extends JpaRepository <Client,Long> {

}
