package com.cg.client;

import com.cg.entitiy.Admin;
import com.cg.service.IAdminService;
import com.cg.service.IAdminServiceImpl;

public class Client {

	public static void main(String[] args) {
		Admin c = new Admin();
		
		c.setId(101);
		c.setName("omkar");
		c.setPassword("54976");
		
		IAdminService se= new  IAdminServiceImpl();
		se.addAdmin(c);
		System.out.println("record is added");
	}
}