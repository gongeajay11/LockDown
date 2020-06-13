package com.tkm.bank.service;

import java.util.List;

import com.tkm.bank.model.Employee;

public interface Service {

	public Employee add(Employee emp);

	public Employee edit(Employee emp);

	public void delete(int empId);

	public List<Employee> getAll();

}
