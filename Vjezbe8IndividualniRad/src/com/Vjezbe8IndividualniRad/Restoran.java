package com.Vjezbe8IndividualniRad;

import java.util.ArrayList;

public class Restoran {
	
	private String naziv;
	private String adresa;
	private int PIB;
	private ArrayList<Radnik> zaposleni;
	
	public Restoran(String naziv, String adresa, int pIB, ArrayList<Radnik> zaposleni) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.PIB = pIB;
		this.zaposleni = zaposleni;
	}
	
	public Restoran() {this(null, null, 0, null);}

	public String getNaziv() {return naziv;}
	public void setNaziv(String naziv) {this.naziv = naziv;}

	public String getAdresa() {return adresa;}
	public void setAdresa(String adresa) {this.adresa = adresa;}

	public int getPIB() {return PIB;}
	public void setPIB(int pIB) {PIB = pIB;}

	public ArrayList<Radnik> getZaposleni() {return zaposleni;}
	public void setZaposleni(ArrayList<Radnik> zaposleni) {this.zaposleni = zaposleni;}

	@Override
	public String toString() {
		return "Restoran ['Naziv': " + getNaziv() + ",\n'Adresa': " + getAdresa() + ",\n'PIB': " + getPIB()
				+ ",\n\n'Zaposleni': " + getZaposleni() + "]";
	}
	
	
	
	
	
	

}
