package it.epicode.EserciziQuartaSettimana;

public class Impiegato {
	private int id;
	private String nome;
	private String cognome;
	private char sesso;
	private double stipendio;
	
	public Impiegato(int id,String nome,String cognome,char sesso,double stipendio) {
		
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.stipendio = stipendio;
		if(sesso != 'M' && sesso != 'F') {
			System.out.println("Specificare un sesso corretto per l'impiegato " + this.nome);
			System.exit(0);
		}
	}
	
	public Impiegato() {
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public char getSesso() {
		return sesso;
	}

	public double getStipendio() {
		return stipendio;
	}

	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", cognome=" + cognome + ", sesso=" + sesso + ", stipendio=" + stipendio
				+ "]";
	}
	
}
