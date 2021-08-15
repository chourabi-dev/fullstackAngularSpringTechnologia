package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.PhoneNumber;

public interface PhoneRepository extends JpaRepository<PhoneNumber,Long> {

}
