package org.teutonic.herpfortress.unit.order;

import org.teutonic.herpfortress.unit.Mob;

public class Order {
	public Mob unit;

	public void init(Mob unit) {
		this.unit = unit;
	}

	public void tick() {
	}

	public boolean finished() {
		return true;
	}
}