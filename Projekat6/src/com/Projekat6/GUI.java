package com.Projekat6;

import java.awt.GridLayout;

import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


public class GUI extends JFrame{
	
		private JLabel ime;
		private JLabel health;
		private JLabel x;
		private JLabel y;
		private JLabel kolajder;
		
		private JTextField imeTekst;
		private JTextField healthTekst;
		private JTextField xPozicija;
		private JTextField yPozicija;
		
		private JButton dugme;
		private JTextArea tekstBox;
		private JMenuBar menu;
		
		private JMenu rectangle;
		private JMenu circle;
		
	public GUI() {
		super("Igrica");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(6, 2, 10, 10));
		
		ime = new JLabel("Ime"); add(ime);
		imeTekst = new JTextField(15); add(imeTekst);
		
		health = new JLabel("Health (0-100)"); add(health);
		healthTekst = new JTextField(15); add(healthTekst);
		
		x = new JLabel("X pozicija"); add(x);
		xPozicija = new JTextField(15); add(xPozicija);
		
		y = new JLabel("Y pozicija"); add(y);
		yPozicija = new JTextField(15); add(yPozicija);
		
		kolajder = new JLabel("Kolajder"); add(kolajder);
		menu = new JMenuBar(); add(menu);
		
		dugme = new JButton("Pokreni igru"); add(dugme);
		tekstBox = new JTextArea();
	}

}
