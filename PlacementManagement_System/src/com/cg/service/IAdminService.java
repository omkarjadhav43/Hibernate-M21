package com.cg.service;

import com.cg.entitiy.Admin;

public interface IAdminService {
		Admin addAdmin(Admin admin) ;
		Admin updateAdmin(Admin admin);
		 Admin searchAdmin(long id);
		 Admin login(Admin admin);
	boolean logout();
	

}
