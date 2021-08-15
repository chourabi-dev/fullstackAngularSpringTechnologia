package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.Model;

public interface ModelRepository extends JpaRepository<Model,Long> {

}
