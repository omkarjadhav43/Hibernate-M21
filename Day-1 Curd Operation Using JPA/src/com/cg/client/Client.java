package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp=new Employee();
		emp.setID(101);
		emp.setNAME("omkar");
		service.addEmployee(emp);

	}

}
