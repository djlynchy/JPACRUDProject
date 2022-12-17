package com.skilldistillery.firearm.data;

import java.util.List;

import com.skilldistillery.firearm.entities.Firearm;

public interface FirearmDAO {
	
	Firearm findbyName(String name );
	List<Firearm> findAll();
	Firearm create(Firearm firearm);
	Firearm update(String name, Firearm firearm);
	boolean delete(String name);

}
