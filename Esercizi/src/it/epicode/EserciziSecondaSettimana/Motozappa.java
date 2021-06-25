package it.epicode.EserciziSecondaSettimana;

import java.time.LocalDate;

public class Motozappa extends Macchinario {
	private int numeroRuote;
	
	public Motozappa(String marca,LocalDate dataDiIngresso,int numeroRuote) {
		super(marca,dataDiIngresso);
		this.numeroRuote = numeroRuote;
	}

	public int getNumeroRuote() {
		return numeroRuote;
	}

	public void setNumeroRuote(int numeroRuote) {
		this.numeroRuote = numeroRuote;
	}
	
	
//	public void info() {
//		System.out.println("Marca: " +marca);
//		System.out.println("Numero ruote " + numeroRuote);
//		System.out.println("Data di ingresso in officina: "+ dataDiIngresso);
//		System.out.println("Costo totale riparazioni: " + costoTotale());
//		System.out.println("###############");
//	}
	
	
}
