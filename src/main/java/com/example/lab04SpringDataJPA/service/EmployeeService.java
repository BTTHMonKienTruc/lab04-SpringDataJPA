package com.example.lab04SpringDataJPA.service;

import java.util.List;

import com.example.lab04SpringDataJPA.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(String manv);
	public void save(Employee employee);
	public void delete(String manv);
}
