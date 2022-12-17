package com.skilldistillery.firearm.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirearmTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Firearm firearm;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	emf= Persistence.createEntityManagerFactory("JPAFirearm");
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em= emf.createEntityManager();
		firearm=em.find(Firearm.class, 1);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		firearm = null;
	}

	@Test
	void test_Firearm() {
		assertNotNull(firearm);
		assertEquals("M14", firearm.getName());
	}

}
