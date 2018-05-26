package com.weapons;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

class KnifeTest {

	private Knife knife;
	
	@BeforeEach
	void setUp() {
		this.knife = new Knife();
	}
	
	@AfterEach
	void tearDown() {
		this.knife = null;
	}
  
	@Test
	public void testGetName() {
		assertEquals(this.knife.getName(), "knife");
	}
	
	@Test
	void testAttack() {
		assertEquals(this.knife.attack(), "knife");
	}

}
