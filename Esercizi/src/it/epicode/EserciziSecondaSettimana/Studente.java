package it.epicode.EserciziSecondaSettimana;

import java.time.LocalDate;

import it.epicode.EserciziSecondaSettimana.Lavoratore.statoLavoratore;

public class Studente extends Persona {
	private int matricola;
	private String corsoDiLaurea;
	private statoStudente stato;

	public Studente(String nome, String cognome, int matricola, String corsoDiLaurea, statoStudente stato) {
		super(nome, cognome);
		this.matricola = matricola;
		this.corsoDiLaurea = corsoDiLaurea;
		this.stato = stato;
	}

	public void infoStudente() {
		System.out.println("###############");
		System.out.println("Nome e cognome: " + info());
		System.out.println("Matricola: " + matricola);
		System.out.println("Corso di laurea: " + corsoDiLaurea);
		System.out.println("Stato: " + stato);
	}

	public enum statoStudente {
		IN_CORSO, FUORI_CORSO, LAUREATO, INTERROTTO;
	}

}
