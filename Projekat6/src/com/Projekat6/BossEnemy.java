package com.Projekat6;

public class BossEnemy extends Enemy {

	@Override
	public int getEffectiveDamage() {
		return super.getEffectiveDamage() * 2;
	}

	@Override
	public String toString() {
		return "BossEnemy [" + getTipNeprijatelja() + "  @  (" + getX() + "," + getY() + 
				") " + "Dimenzija x Dimenzija" + " DMG=" + getDamage() + "x2 HP=" + getHealth() + "."; 
	}
	

}
