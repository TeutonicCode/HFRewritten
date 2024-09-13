package org.teutonic.herpfortress.unit;

import org.teutonic.herpfortress.Player;
import org.teutonic.herpfortress.weapon.Revolver;

public class Spy extends Mob {
	public Spy(Player player) {
		super(8, player);
		maxHealth = health = 125;
		speed = 100;

		weapon = new Revolver(this);
	}
}