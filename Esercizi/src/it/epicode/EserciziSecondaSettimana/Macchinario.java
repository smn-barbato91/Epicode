package it.epicode.EserciziSecondaSettimana;

import java.util.Scanner;
import java.time.LocalDate;

public class Macchinario {

	Lavorazione[] lavorazioni = new Lavorazione[10]; // ogni lavorazione è una riparazione di qualcosa(posso riparare al
	// max dieci cose contemporaneamente)
	String marca;
	LocalDate dataDiIngresso;

	public Macchinario(String marca, LocalDate dataDiIngresso) {

		this.marca = marca;
		this.dataDiIngresso = dataDiIngresso;
	}
	
	public boolean aggiungiLavorazione(Lavorazione lav) { //Inserisce il costo lavorazione nella posizione i dell'array lavorazioni
		for(int i = 0; i < lavorazioni.length; i ++) {//Questo metodo lo richiamo all'interno del metodo ripara(classe officina)
			if(lavorazioni[i] == null) {
				lavorazioni[i] = lav;
				return true;
			}
		}
		return false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getDataDiIngresso() {
		return dataDiIngresso;
	}

	public void setDataDiIngresso(LocalDate dataDiIngresso) {
		this.dataDiIngresso = dataDiIngresso;
	}

	public Lavorazione[] getLavorazioni() {

		return lavorazioni;
	}

	public void setLavorazioni(Lavorazione[] lavorazioni) {
		this.lavorazioni = lavorazioni;
	}

}
