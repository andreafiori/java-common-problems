package com.player;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.weapons.Knife;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

class PlayerTest {

	private Player player;
	
	@BeforeEach
	void setUp() {
		this.player = new Player( new Knife() );
	}
	
	@AfterEach
	void tearDown() {
		this.player = null;
	}
	
	@Test
	void testSetWeapon() {
		this.player.setWeapon( new Knife() );
		
		assertTrue( this.player.getWeapon() instanceof Knife);
	}
	
	@Test
	void testWeaponAttack() {
		assertEquals(this.player.action(), "knife");
	}

}
