package com.Vjezbe8;

public class TV extends EProizvodi {
	
	private int velicinaEkrana;

	public TV(String sifraProizvoda, double cijenaProizvoda, String opisProizvoda, int velicinaEkrana) {
		super(sifraProizvoda, cijenaProizvoda, opisProizvoda);
		this.velicinaEkrana = velicinaEkrana;
	}
	
	public TV() {
		this(null, 0, null, 0);
	}

	public int getVelicinaEkrana() {return velicinaEkrana;}
	public void setVelicinaEkrana(int velicinaEkrana) {this.velicinaEkrana = velicinaEkrana;}

	@Override
	public String toString() {
		return "TV ['Sifra proizvoda': " + getSifraProizvoda() + ",\n'Cijena proizvoda': "
				+ getCijenaProizvoda() + ",\n'Opis proizvoda': " + getOpisProizvoda() + ",\n'Velicina ekrana': "+ getVelicinaEkrana() + "]";
	}
	
	
	
	

}
