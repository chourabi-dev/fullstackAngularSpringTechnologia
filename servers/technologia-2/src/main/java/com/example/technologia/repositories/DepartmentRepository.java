package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
