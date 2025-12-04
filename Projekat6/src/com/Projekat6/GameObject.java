package com.Projekat6;

public abstract class GameObject implements Collidable{
	
	private int x;
	private int y;
	private Collidable collider;
	
	
	
	public GameObject(int x, int y, Collidable collider) {
		super();
		this.x = x;
		this.y = y;
		this.collider = collider;
	}
	
	public GameObject() {
		this(0, 0, null);
	}
	public int getX() {return x;}
	public void setX(int x) {this.setX(x);}

	public int getY() {return y;}
	public void setY(int y) {this.setY(y);}

	public Collidable getCollider() {return collider;}
	public void setCollider(Collidable collider) {this.setCollider(collider);}
	
	
	@Override
	public boolean intesects(Collidable other) {
		return false;
	}

	@Override
	public String toString() {
		return "GameObject []";
	}
	
	public abstract String getDisplayName();
	
}
