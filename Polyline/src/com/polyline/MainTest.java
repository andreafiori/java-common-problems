package com.polyline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

	@BeforeEach
	void setUp() {
		new Main();
	}

	@Test
	public void testMain() throws Exception {
		String[] args = null;
		Main.main(args);
	}

}
