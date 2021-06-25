package it.epicode.EserciziSecondaSettimana;

import java.time.LocalDate;

public class Lavoratore extends Persona{
	private String matricola;
	private String azienda;
	private LocalDate dataDiAssunzione;
	private statoLavoratore stato;
	
	public Lavoratore(String nome,String cognome,String matricola,String azienda,LocalDate dataDiAssunzione,statoLavoratore stato) {
		super(nome,cognome);
		this.matricola = matricola;
		this.azienda = azienda;
		this.dataDiAssunzione = dataDiAssunzione;
		this.stato = stato;
	}
	
	public void infoLavoratore() {
		System.out.println("################");
		System.out.println("Nome e cognome: " +info());
		System.out.println("Matricola: " + matricola);
		System.out.println("Azienda: " + azienda);
		System.out.println("Data assunzione: " + dataDiAssunzione);
		System.out.println("Stato lavoratore: " + stato);
	}
	
	public enum statoLavoratore{
		IN_ATTIVITA,IN_FERIE,IN_MALATTIA;
	}

}
