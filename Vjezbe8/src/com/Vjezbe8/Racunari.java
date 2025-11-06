package com.Vjezbe8;

public class Racunari extends EProizvodi {
	
	private String procesor;
	private int memorija;
	
	public Racunari(String sifraProizvoda, double cijenaProizvoda, String opisProizvoda, String procesor,
			int memorija) {
		super(sifraProizvoda, cijenaProizvoda, opisProizvoda);
		this.procesor = procesor;
		this.memorija = memorija;
	}

	public Racunari() {
		this(null, 0, null, null, 0);
	}

	public String getProcesor() {return procesor;}
	public void setProcesor(String procesor) {this.procesor = procesor;}

	public int getMemorija() {return memorija;}
	public void setMemorija(int memorija) {this.memorija = memorija;}

	@Override
	public String toString() {
		return "Racunar ['Sifra proizvoda': " + getSifraProizvoda() + ",\n'Cijena proizvoda': "
				+ getCijenaProizvoda() + ",\n'Opis proizvoda': " + getOpisProizvoda() + ",\n'Procesor': "+ getProcesor() +
				",\n'Memorija': "+ getMemorija() + "]";
	}

}
