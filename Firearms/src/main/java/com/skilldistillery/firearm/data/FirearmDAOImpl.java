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
	public Firearm findFirearmById(int id) {
		return em.find(Firearm.class, id);
	}

	@Override
	public List<Firearm> findFirearms() {
	
		return em.createQuery("SELECT f FROM Firearm f",Firearm.class).getResultList();
	}

	@Override
	public Boolean deleteFirearm(int id) {
		
		try {
			
			Firearm firearm =em.find(Firearm.class,id);
			
			em.remove(firearm);
			
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public Firearm updateFirearm(int id, Firearm firearm) {
		
		Firearm firearmUpdate = em.find(Firearm.class, id);
		
		firearmUpdate.setName(firearm.getName());
		firearmUpdate.setCaliber(firearm.getCaliber());
		firearmUpdate.setOperation(firearm.getOperation());
		firearmUpdate.setCapacity(firearm.getCapacity());
		firearmUpdate.setType(firearm.getType());
	
		return firearm;
	}
	@Override
	public Firearm createFirearm(Firearm firearm) {
		em.persist(firearm);
	
		return firearm;
	}

	@Override
	public String findbyName(String name) {
		return name;
	}

	@Override
	public List<Firearm> findAll() {
		String jsql = "SELECT f FROM Firearm f";
		return em.createQuery(jsql, Firearm.class).getResultList();
	}

}