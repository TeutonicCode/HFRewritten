package org.teutonic.herpfortress.unit;

import org.teutonic.herpfortress.Player;
import org.teutonic.herpfortress.weapon.StickyBombLauncher;

public class Demoman extends Mob {
	public Demoman(Player player) {
		super(3, player);
		maxHealth = health = 175;
		speed = 93;

		weapon = new StickyBombLauncher(this);
	}
}