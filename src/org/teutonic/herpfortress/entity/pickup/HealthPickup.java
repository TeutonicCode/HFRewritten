package org.teutonic.herpfortress.entity.pickup;

import org.teutonic.herpfortress.unit.Mob;

public class HealthPickup extends Pickup {
	public HealthPickup(int size) {
		this.size = size;
		icon = size + 0 * 8;
	}

	public boolean take(Mob u) {
		if (u.health >= u.maxHealth) return false;
		if (size == 0) u.heal((int) (u.maxHealth * 0.205));
		if (size == 1) u.heal((int) (u.maxHealth * 0.5));
		if (size == 2) u.heal((int) (u.maxHealth * 1));
		return true;
	}
}