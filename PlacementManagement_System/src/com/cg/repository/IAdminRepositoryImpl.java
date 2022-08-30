package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entitiy.Admin;

public class IAdminRepositoryImpl implements IAdminRepository{
	private EntityManager em;
	public IAdminRepositoryImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}
	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		em.persist(admin);
		return admin;
		
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		em.merge(admin);
		return admin;
	}

	@Override
	public Admin searchAdmin(long id) {
		Admin admin=em.find(Admin.class, id);
		return admin;
	}

	@Override
	public void begineTransaction() {
		
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
		
	}
	
	

}
