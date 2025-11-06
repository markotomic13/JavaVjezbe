package com.Vjezbe8;

public class Telefoni extends EProizvodi {
	
	private String operativniSistem;
	private int velicinaEkrana;
	
	public Telefoni(String sifraProizvoda, double cijenaProizvoda, String opisProizvoda, String operativniSistem,
			int velicinaEkrana) {
		super(sifraProizvoda, cijenaProizvoda, opisProizvoda);
		this.operativniSistem = operativniSistem;
		this.velicinaEkrana = velicinaEkrana;
	}
	
	public Telefoni() {
		this(null, 0, null, null, 0);
	}

	public String getOperativniSistem() {return operativniSistem;}
	public void setOperativniSistem(String operativniSistem) {this.operativniSistem = operativniSistem;}

	public int getVelicinaEkrana() {return velicinaEkrana;}
	public void setVelicinaEkrana(int velicinaEkrana) {this.velicinaEkrana = velicinaEkrana;}

	@Override
	public String toString() {
		return "Telefon ['Sifra proizvoda': " + getSifraProizvoda() + ",\n'Cijena proizvoda': "
				+ getCijenaProizvoda() + ",\n'Opis proizvoda': " + getOpisProizvoda() + ",\n'Operativni sistem': "+ getOperativniSistem() +
				",\n'Velicina ekrana': "+ getVelicinaEkrana() + "]";
	}
	
	
	
	

}
