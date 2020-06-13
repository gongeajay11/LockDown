package com.tkm.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tkm.bank.model.Employee;
import com.tkm.bank.repository.EmployeeRepo;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public Employee add(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee edit(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public void delete(int empId) {
		repo.deleteById(empId);

	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return (List<Employee>) repo.findAll();
	}

}
