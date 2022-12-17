package com.skilldistillery.firearm.data;

import java.util.List;

import com.skilldistillery.firearm.entities.Firearm;

public interface FirearmDAO {

	Firearm findbyName(String name);

	List<Firearm> findAll();

	Firearm createFirearm(Firearm firearm);

	Firearm updateFirearm(String name, Firearm firearm);

	boolean deleteFirearm(String name);

//	future goals
//	list by calibers
//	list by action of firearm
//	list by operation
//	list by maker
//	
//	maybe make a list of what is own and want.
//	possibly add serial numbers, however only accessible to only the owner 
//	
//	
//	
}
