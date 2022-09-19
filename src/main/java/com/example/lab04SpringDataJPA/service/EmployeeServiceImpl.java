package com.example.lab04SpringDataJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.lab04SpringDataJPA.entity.Employee;
import com.example.lab04SpringDataJPA.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(String manv) {
		// TODO Auto-generated method stub
		Optional<Employee> result = employeeRepository.findById(manv);
		
		Employee e = null;
		if (result.isPresent()) {
			e = result.get();
		}else {
			throw new RuntimeException("K tim thay nhan vien ma: "+ manv);
		}
		return e;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String manv) {
		// TODO Auto-generated method stub
		
	}

}
