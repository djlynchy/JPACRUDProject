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
		String jsql = "SELECT f FROM Firearm f";
		return em.createQuery(jsql, Firearm.class).getResultList();
			 
		
	}

	@Override
	public Firearm create(Firearm firearm) {
		em.persist(firearm);
		return firearm;
	}

	@Override
	public Firearm update(String name, Firearm firearm) {
Firearm firearmUpdate = em.find(Firearm.class, name);
		
		firearmUpdate.setName(firearm.getName());
		firearmUpdate.setCaliber(firearm.getCaliber());
		firearmUpdate.setOperation(firearm.getOperation());
		firearmUpdate.setCapacity(firearm.getCapacity());
		firearmUpdate.setType(firearm.getType());
	
		return firearm;
	}



	@Override
	public boolean delete(String name) {
		try {
				
				Firearm firearm =em.find(Firearm.class,name);
				
				em.remove(firearm);
				
				return true;
			} 
			catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	}

}
