package com.mindgate.repository;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee);

	
	
	List<Employee> getAllEmployees();
	boolean deleteEmployeeByEmployeeId(int employeeId);
	
	Employee getEmployeeByEmployeeId(int employeeId);
	boolean updateEmployee(Employee employee);
}
