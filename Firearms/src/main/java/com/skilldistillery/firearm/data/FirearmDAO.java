package com.skilldistillery.firearm.data;

import java.util.List;

import com.skilldistillery.firearm.entities.Firearm;

public interface FirearmDAO {

	public String findbyName(String name);

	public List<Firearm> findAll();

	public Firearm createFirearm(Firearm firearm);
	
	
	
	public Firearm updateFirearm (int id, Firearm firearm);

	

	java.lang.Boolean deleteFirearm(int id);

	public Firearm findFirearmById(int id);

	

	

	

//	future goals
//	list by calibers
//	list by action of firearm
//	list by operation
//	list by maker
//	
//	maybe make a list of what is own and want.
//	possibly add serial numbers, however only accessible to only the owner 
//	
//	might include a list of known ranges to visit and what they offer
//	
}
