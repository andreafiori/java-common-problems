package com.player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerWeaponTest {
	
	@BeforeEach
	void setUp() {
		new PlayerWeapon();
	}

	@Test
	public void testMain() throws Exception {
		String[] args = null;
		PlayerWeapon.main(args);
	}

}
