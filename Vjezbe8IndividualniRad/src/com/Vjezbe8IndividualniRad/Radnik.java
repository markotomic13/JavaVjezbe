package com.Vjezbe8IndividualniRad;

import java.util.ArrayList;

public class Radnik {
	
	protected int ID;
	protected String ime;
	protected String prezime;
	protected double plataPoSatu;
	protected double ukupanBrojSati;
	
	public Radnik(int iD, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		super();
		this.ID = iD;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
	}
	
	public Radnik(){
		this(0, null, null, 0, 0);
	}

	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}

	public String getIme() {return ime;}
	public void setIme(String ime) {this.ime = ime;}

	public String getPrezime() {return prezime;}
	public void setPrezime(String prezime) {this.prezime = prezime;}

	public double getPlataPoSatu() {return plataPoSatu;}
	public void setPlataPoSatu(double plataPoSatu) {this.plataPoSatu = plataPoSatu;}

	public double getUkupanBrojSati() {return ukupanBrojSati;}
	public void setUkupanBrojSati(double ukupanBrojSati) {this.ukupanBrojSati = ukupanBrojSati;}
	
	public double obracunPlate(ArrayList<Radnik> radnici) {
		double plata = 0;
		for(Radnik radnik : radnici) {
			plata = radnik.getPlataPoSatu()*radnik.getUkupanBrojSati()*7;
		}
		return plata;
	}

	@Override
	public String toString() {
		return "Radnik ['ID'=" + getID() + ",\n'Ime': " + getIme() + ",\n'Prezime': " + getPrezime()
				+ ",\n'Satnica': " + getPlataPoSatu() + ",\n'Broj odradjenih sati': " + getUkupanBrojSati() + "]";
	}
	
	
	
	

}
