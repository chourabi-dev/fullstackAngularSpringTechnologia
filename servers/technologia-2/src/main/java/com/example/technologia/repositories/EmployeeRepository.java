package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
