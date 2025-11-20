package com.Projekat4;

public class Player extends GameObject {
	
	private String name;
	private int health;
	
	
	public Player(int x, int y, RectangleCollider player, String name, int health) {
		super(x, y, player);
		
		String skracenoIme = name.trim().replaceAll("\\s+", " ");
		String[] rijeci = skracenoIme.toLowerCase().split("\\s+");
        StringBuilder novaRijec = new StringBuilder();
        for (String rijec : rijeci) {
            if (rijec.length() > 0) {
                novaRijec.append(Character.toUpperCase(rijec.charAt(0)))
                  .append(rijec.substring(1))
                  .append(" ");
            }
        }
        this.setName(novaRijec.toString().trim());
		
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
	
	public Player() {
		super(0, 0, null);
		this.setName("Igrac");
		this.setHealth(0);
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getHealth() {return health;}
	public void setHealth(int health) {this.health = health;}



	@Override
	public String getDisplayName() {
		return this.getName();
	}

	@Override
	public String toString() {
		return "Player[" + getName() + "] @ (" + getX() + "," + getY() + ") " + "sirina x visina " + "HP=" + getHealth();
	}
	
	

}
