package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		//Lazy initialization
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp=new Employee();
		
		//Create operation
		emp.setID(103);
		emp.setNAME("om");
		service.addEmployee(emp);
		
		/*//retreive a data
		emp=service.getEmployeeById(101);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());*/
		
		/*//update a data
		emp=service.getEmployeeById(101);
		emp.setNAME("dhiraj");
		service.updateEmployee(emp);*/
		
		/*//retreive a data
		emp=service.getEmployeeById(101);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
	
		//delete a data
		emp=service.getEmployeeById(101);
		service.removeEmployee(emp);*/
	
	
	}
}
