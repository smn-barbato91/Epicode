package it.epicode.EserciziPrimaSettimana;

public class Corso {
	
	public String titolo;
	public int durata; //In ore
	public String livelloDiDifficoltà; //Base,intermedio,avanzato
	public double costo;
	
	public Corso(String titolo, int durata, String livelloDiDifficoltà, double costo) {
		this.titolo = titolo;
		this.durata = durata;
		this.livelloDiDifficoltà = livelloDiDifficoltà;
		this.costo = costo;
	}
	
	public Corso() {
		
	}
	
	

}
