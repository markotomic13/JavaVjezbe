package com.Projekat4;

import java.util.ArrayList;

/*Nisam dovoljno obradio izuzetke da bi ih koristiio i napravio sam gresku kod Collidera 
 * koju nisam znao kako da napravim.*/

public class Game {

	public static void main(String[] args) {
		
		Player igrac = new Player();
		System.out.println(igrac.toString());
		
		ArrayList<Enemy> listaNeprijatelja = new ArrayList<Enemy>();
		listaNeprijatelja.add(new BossEnemy());
		listaNeprijatelja.add(new MeleeEnemy());
		
		ArrayList<String> dnevnikDogadjaja = new ArrayList<String>();
		dnevnikDogadjaja.add("Desila se prijetnja");
		
		for(Enemy e : listaNeprijatelja) {
			System.out.println(e.toString());
		}
	}
	
	public boolean checkCollision(Player p, Enemy e) {
		return p.intesects(e);
	}
	


}
