package com.Vjezbe8;

public class EProizvodi {
	
	protected String sifraProizvoda;
	protected double cijenaProizvoda;
	protected String opisProizvoda;
	
	public EProizvodi(String sifraProizvoda, double cijenaProizvoda, String opisProizvoda) {
		super();
		this.sifraProizvoda = sifraProizvoda;
		this.cijenaProizvoda = cijenaProizvoda;
		this.opisProizvoda = opisProizvoda;
	}
	
	public EProizvodi() {
		this(null, 0, null);
	}
	
	public String getSifraProizvoda() {return sifraProizvoda;}
	public void setSifraProizvoda(String sifraProizvoda) {this.sifraProizvoda = sifraProizvoda;}
	
	public double getCijenaProizvoda() {return cijenaProizvoda;}
	public void setCijenaProizvoda(double cijenaProizvoda) {this.cijenaProizvoda = cijenaProizvoda;}
	
	public String getOpisProizvoda() {return opisProizvoda;}
	public void setOpisProizvoda(String opisProizvoda) {this.opisProizvoda = opisProizvoda;}
	
	public double obracunajUkupnuCijenu(EProizvodi niz[]) {
		
		double ukupnaCijena = 0;
		String pocetnaSifraRacunara = "RA";
		String pocetnaSifraTelefona = "TE";
		String pocetnaSifraTV = "TV";
		
		for (EProizvodi proizvod : niz) {
			
			String karakteriZaProvjeru = getSifraProizvoda().substring(0,1);
			proizvod.setCijenaProizvoda(proizvod.getCijenaProizvoda() + ((proizvod.getCijenaProizvoda()*5)/100));
			
			if(karakteriZaProvjeru.equalsIgnoreCase(pocetnaSifraRacunara)) {
				proizvod.setCijenaProizvoda(getCijenaProizvoda() + ((getCijenaProizvoda()*5)/100));
				ukupnaCijena += getCijenaProizvoda();
			}
		}
		return ukupnaCijena;
	}

	@Override
	public String toString() {
		return "EProizvodi [ 'Sifra proizvoda': " + getSifraProizvoda() + ",\n'Cijena proizvoda': "
				+ getCijenaProizvoda() + ",\n'Opis proizvoda': " + getOpisProizvoda() + "]";
	}
	
// treba uve'ati cijenu svim proizvodima a u zavisnosti od tipa uvecati na sledece nacine, racunari + 5%, Telefoni + 3% ako je ekran veci od 6 inca, TV + 10% ako je ekran veci od 65 inca
}
