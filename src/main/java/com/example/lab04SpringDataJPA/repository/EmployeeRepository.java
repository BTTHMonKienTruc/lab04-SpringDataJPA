package com.example.lab04SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab04SpringDataJPA.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
