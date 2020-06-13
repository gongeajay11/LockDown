package com.tkm.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tkm.bank.model.Employee;
import com.tkm.bank.service.ServiceImpl;

@RestController
@Validated
public class EmployeeController {

	@Autowired
	private ServiceImpl ser;

	@PostMapping(value = "/api/save")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Employee addEmployee(@RequestBody Employee emp) {
		return ser.add(emp);
	}

	@PutMapping(value = "/api/edit")
	@ResponseStatus(value = HttpStatus.OK)
	public Employee editEmployee(@RequestBody Employee emp) {
		return ser.edit(emp);
	}

	@DeleteMapping(value = "api/delete")
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteEmployee(@RequestParam int empId ) {
		ser.delete(empId);
	}

	@GetMapping(value = "api/get")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Employee> get() {
		return ser.getAll();
	}

}
