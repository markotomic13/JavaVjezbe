package com.Vjezbe8IndividualniRad;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Radnik> zaposleni = new ArrayList<>();
		
		zaposleni.add(new Konobar(1, "Marko","Tomic", 2, 10));
		zaposleni.add(new Menadzer(2, "Toma", "Tomovic", 4, 20));
		zaposleni.add(new Kuvar(3, "Mirko", "Mirkovic", 8, 30));
		zaposleni.add(new Konobar(4, "Zarko", "Zarkovic", 3, 15));
		zaposleni.add(new Kuvar(5, "Slavko", "Slavkovic", 9, 26));
		
		
		Restoran UDG = new Restoran("UDG", "Oktoih 1", 213546, zaposleni);
		
		System.out.print(UDG.toString());
		
	}

}
