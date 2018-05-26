package com.weapons;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

class RevolverTest {

	private Revolver revolver;
	
	@BeforeEach
	void setUp() {
		this.revolver = new Revolver();
	}
	
	@AfterEach
	void tearDown() {
		this.revolver = null;
	}

	@Test
	void testGetName() {
		assertEquals(this.revolver.getName(), "revolver");
	}
	
	@Test
	void testAttack() {
		assertEquals(this.revolver.attack(), "revolver");
	}

}
