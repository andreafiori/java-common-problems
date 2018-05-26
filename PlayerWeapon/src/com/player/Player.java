package com.player;

import com.weapons.Weapon;

public class Player {
	private Weapon weapon;
	private String name;

	public Player(Weapon weapon) {
	    this.weapon = weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String action() {
		return this.weapon.attack();
	}
}