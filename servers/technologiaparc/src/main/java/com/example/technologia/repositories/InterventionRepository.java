package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention,Long> {

}
