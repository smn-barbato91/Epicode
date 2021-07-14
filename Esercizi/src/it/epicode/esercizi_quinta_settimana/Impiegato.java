package it.epicode.esercizi_quinta_settimana;

import java.math.BigDecimal;

public class Impiegato implements Comparable<Impiegato>{

	private String nome;
	private String cognome;
	private BigDecimal stipendio;
	private Sesso sesso;
	private String matricola;
	
	public Impiegato(String nome, String cognome, BigDecimal stipendio, Sesso sesso, String matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
		this.sesso = sesso;
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public BigDecimal getStipendio() {
		return stipendio;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public String getMatricola() {
		return matricola;
	}

	@Override
	public int compareTo(Impiegato o) { 
		//return this.cognome.compareTo(o.cognome); 	//comparo gli impiegati in base al loro cognome richiamando l'ordinamento naturale delle stringhe
		return this.nome.length() - o.nome.length();
	}
	
	
	
}
