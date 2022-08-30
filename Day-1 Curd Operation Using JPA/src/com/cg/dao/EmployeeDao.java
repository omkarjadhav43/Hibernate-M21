package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao 
{

	void addEmployee(Employee em);//creation
	void updateEmployee(Employee em);//updation
	Employee getEmployeeById(int ID);//Retrieve
	void removeEmployee(Employee em);//Delete
	
	void commitTransaction();//close an entity manager
	
	void beginTransaction();//begin the operation of entity Manager
}