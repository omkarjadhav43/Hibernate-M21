package com.cg.service;

import java.util.Scanner;

import com.cg.entitiy.Admin;
import com.cg.repository.IAdminRepository;
import com.cg.repository.IAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService {
private IAdminRepository uao;

Scanner s=new Scanner(System.in);
	

	
	public IAdminServiceImpl() {
		
		uao=new IAdminRepositoryImpl();
	}
	@Override
	public Admin addAdmin(Admin admin) {
		uao.begineTransaction();
		uao.addAdmin(admin);
		uao.commitTransaction();
		return admin;
		
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		uao.begineTransaction();
		uao.updateAdmin(admin);
		uao.commitTransaction();
		return admin;
		
	}

	@Override
	public Admin searchAdmin(long id) {
		uao.begineTransaction();
		Admin admin=uao.searchAdmin(id);
		uao.commitTransaction();
		return admin;
		
	}
	@Override
	public Admin login(Admin admin) {
		System.out.println("Enetr the admin name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==admin.getName() && upsw==admin.getPassword()) {
			return admin;
	}
	
	else {
		System.out.println("Invalid admin name or password :");
		return null;
	}
	}
	@Override
	public boolean logout() {
		System.exit(0);
		return true;
	}
	

}
