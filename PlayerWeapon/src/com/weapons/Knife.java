package com.weapons;

public class Knife extends Weapon {
	
	public Knife() {
		super();

		super.setName("knife");
	}

	public String attack() {
		return super.getName();
	}
}
