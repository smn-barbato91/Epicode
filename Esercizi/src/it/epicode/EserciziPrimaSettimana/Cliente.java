package it.epicode.EserciziPrimaSettimana;
import java.time.LocalDate;

public class Cliente {
	
	
	public String nome;
	public String cognome;
	public String codiceFiscale;
	public String numeroDiTelefono;
	public LocalDate dataDiNascita;
	public ContoCorrente conti[] = new ContoCorrente[3]; //Dichiaro un array di tipo ContoCorrente 
	
	public Cliente() { //Costruttore di default
		
	}
	
	public Cliente(String nome, String cognome,String codiceFiscale,
			String numeroDiTelefono, LocalDate dataDiNascita, ContoCorrente c) {//Costruttore con dei parametri che inizializzano le variabili di istanza
		
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.numeroDiTelefono = numeroDiTelefono;
		this.dataDiNascita = dataDiNascita;
		this.conti[0] = c;
	}
	
	
	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	

	public void saluta() {
		
		System.out.println("Buongiorno a tutti mi chiamo " + nome + " " + cognome);
		
	}
	
	public boolean isMillennial() {
		
		return dataDiNascita.getYear() >= 2000;
	} 
	
	public boolean aggiungiConto(ContoCorrente aggiunto) {
		
		for(int i = 0; i < conti.length; i ++) {
			if (conti[i] == null) {
				conti[i] = aggiunto;
				return true;
			}
		}
		return false; 
	}
	
	public ContoCorrente rimuoviConto(int pos) {//Elimina di fatto un conto corrente dall'array
		
		ContoCorrente rimosso = conti[pos]; //variabile d'appoggio
		
		conti[pos] = null; //non c'è bisogno dell'if tanto se è null rimane null.
		
		return rimosso; //Ritorna il valore del conto rimosso
	}
	
	public double getSaldoTotole() {
		
		double somma = 0;
		
		for (int i = 0; i < conti.length; i++) {
			if (conti[i] != null ) {
				somma = somma + conti[i].saldo;
			}
		}
		return somma;
	}
	

	

}
