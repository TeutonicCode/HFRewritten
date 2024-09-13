package org.teutonic.herpfortress.unit;

import org.teutonic.herpfortress.Player;
import org.teutonic.herpfortress.weapon.Minigun;

public class Heavy extends Mob {
	public Heavy(Player player) {
		super(4, player);
		maxHealth = health = 300;
		speed = 77;

		weapon = new Minigun(this);
	}
}