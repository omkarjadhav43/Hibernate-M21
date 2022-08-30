package com.cg.repository;

import com.cg.entitiy.Admin;

public interface IAdminRepository  {
	public Admin addAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin searchAdmin(long id);
	
	void begineTransaction();
	void commitTransaction();
	
	

	
	

}
