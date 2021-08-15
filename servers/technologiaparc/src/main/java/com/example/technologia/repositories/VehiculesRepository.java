package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.Vehicule;

public interface VehiculesRepository extends JpaRepository<Vehicule,Long> {

}
