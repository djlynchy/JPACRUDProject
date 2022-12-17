package com.skilldistillery.firearm.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.firearm.entities.Firearm;
@Service
@Transactional
public class FirearmDAOImpl implements FirearmDAO {
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Firearm findbyName(String name) {
		return em.find(Firearm.class, name);
	}

	@Override
	public List<Firearm> findAll() {
		String jsql = "SELECT x FROM Firearm x";
		return em.createQuery(jsql, Firearm.class).getResultList();
			 
		
	}

	@Override
	public Firearm create(Firearm firearm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Firearm update(String name, Firearm firearm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
