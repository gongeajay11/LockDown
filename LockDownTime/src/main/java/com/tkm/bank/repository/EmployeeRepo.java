package com.tkm.bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tkm.bank.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
