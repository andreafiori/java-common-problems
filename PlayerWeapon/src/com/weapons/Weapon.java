package com.weapons;

abstract public class Weapon {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String attack() {
		return getName();
	}
}
