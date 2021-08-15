package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.JobStarter;

public interface JobsRepository extends JpaRepository<JobStarter,Long> {

}
