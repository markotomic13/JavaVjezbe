package com.Vjezbe8IndividualniRad;

import java.util.ArrayList;

public class Kuvar extends Radnik {
	
	public Kuvar(int iD, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		super(iD, ime, prezime, plataPoSatu, ukupanBrojSati);
	}
	
	public Kuvar() {
		this(0, null, null, 0, 0);
	}

	@Override
	public double obracunPlate(ArrayList<Radnik> radnici) {
		double plata = 0;
		for(Radnik radnik : radnici) {
			plata = radnik.getPlataPoSatu() * radnik.getUkupanBrojSati() * 7;
		}
		return plata;
	}

	@Override
	public String toString() {
		return "Kuvar ['ID'=" + getID() + ",\n'Ime': " + getIme() + ",\n'Prezime': " + getPrezime()
		+ ",\n'Satnica': " + getPlataPoSatu() + ",\n'Broj odradjenih sati': " + getUkupanBrojSati() + "]\n";
	}
	
	
	
}
