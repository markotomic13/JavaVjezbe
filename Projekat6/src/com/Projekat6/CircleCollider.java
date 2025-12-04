package com.Projekat6;

public class CircleCollider implements Collidable {
	private int x;
	private int y;
	private float r;
	
	
	public CircleCollider(int x, int y, float r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		if (this.r < 0) {
			System.out.print("IllegalArgumentException");
			this.setR(0);
		}
	}
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}

	public int getY() {return y;}
	public void setY(int y) {this.y = y;}

	public float getR() {return r;}
	public void setR(float r) {this.r = r;}


	@Override
	public boolean intesects(Collidable other) {
		return false;
	}

}
