package org.teutonic.herpfortress.unit;

import org.teutonic.herpfortress.Player;
import org.teutonic.herpfortress.weapon.Scattergun;

public class Scout extends Mob {
	public Scout(Player player) {
		super(0, player);
		maxHealth = health = 125;
		speed = 133;
		visRange = 10;

		weapon = new Scattergun(this);
	}
}