package com.Projekat4;

public class RectangleCollider implements Collidable {
	
	 private int x;
	 private int y;
	 private float sirina;
	 private float visina;
	 
	 
	 public RectangleCollider(int x, int y, float sirina, float visina) {
		super();
		this.x = x;
		this.y = y;
		this.sirina = sirina;
			if (this.sirina < 0) {
				System.out.print("IllegalArgumentException");
				this.setSirina(0);
			}
		this.visina = visina;
			if (this.visina < 0) {
				System.out.print("IllegalArgumentException");
				this.setVisina(0);
			}
	}

	 public RectangleCollider() {
		 this(0, 0, 0, 0);
	 }
	 
	 public int getX() {return x;}
	 public void setX(int x) { this.setX(x);}

	 public int getY() {return y;}
	 public void setY(int y) {this.setY(y);}

	 public float getSirina() {return sirina;}
	 public void setSirina(float sirina) {this.setSirina(sirina);}

	 public float getVisina() { return visina;}
	 public void setVisina(float visina) {this.setVisina(visina);}


	@Override
	public boolean intesects(Collidable other) {
		return false;
	}

}
