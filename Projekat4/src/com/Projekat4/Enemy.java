package com.Projekat4;

public class Enemy extends GameObject implements Attacker{
	
	private String tipNeprijatelja;
	private int damage;
	private int health;
	
	

	public Enemy(int x, int y, Collidable collider, String tipNeprijatelja, int damage, int health) {
		super(x, y, collider);
		this.tipNeprijatelja = tipNeprijatelja.trim();
		if(this.tipNeprijatelja.equals(null)) {
			this.setTipNeprijatelja("Neprijatelj");
		}
		this.damage = damage;
		if(this.damage< 0) {
			System.out.print("IllegalArgumentException");
			this.setDamage(0);
		}
		if(this.health > 100) {
			System.out.print("IllegalArgumentException");
			this.setDamage(100);
		}
		this.health = health;
		if(this.health < 0) {
			System.out.print("IllegalArgumentException");
			this.setHealth(0);
		}
		if(this.health > 100) {
			System.out.print("IllegalArgumentException");
			this.setHealth(100);
		}
	}
	public Enemy() {
		this(0, 0, null, "Neprijatelj", 0, 0);
	}
	
	
	public String getTipNeprijatelja() {return tipNeprijatelja;}
	public void setTipNeprijatelja(String tipNeprijatelja) {this.tipNeprijatelja = tipNeprijatelja.trim();}

	public int getDamage() {return damage;}
	public void setDamage(int damage) {this.damage = damage;}

	public int getHealth() {return health;}
	public void setHealth(int health) {this.health = health;}

	@Override
	public String getDisplayName() {
		return null;
	}

	@Override
	public int getEffectiveDamage() {
		return this.getDamage();
	}


	@Override
	public String toString() {
		return "Enemy [" + getTipNeprijatelja() + "  @  (" + getX() + "," + getY() + 
				") " + "Dimenzija x Dimenzija" + " DMG=" + getDamage() + " HP=" + getHealth() + "."; 
	}


	
	
	
	

}
