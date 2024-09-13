package org.teutonic.herpfortress.unit;

import org.teutonic.herpfortress.Player;
import org.teutonic.herpfortress.weapon.Shotgun;

public class Engineer extends Mob {
	public Engineer(Player player) {
		super(5, player);
		maxHealth = health = 125;
		speed = 100;

		weapon = new Shotgun(this);
	}
}