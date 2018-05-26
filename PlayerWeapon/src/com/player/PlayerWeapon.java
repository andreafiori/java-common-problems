package com.player;

import com.weapons.Knife;
import com.weapons.Revolver;

public class PlayerWeapon {

	public static void main(String args[]) {
		Player player = new Player( new Knife() );
		player.setName("Andrea");
		System.out.println( player.getName() + " performed a " + player.action() + " attack");
		
		player = new Player( new Revolver() );
		player.setName("Stephen");
		System.out.println( player.getName() + " performed a " + player.action() + " attack");
	}
}
