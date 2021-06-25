package it.epicode.EserciziSecondaSettimana;

import java.time.LocalDate;

public class Alimentare extends Prodotto {
	private LocalDate dataDiScadenza;
	private boolean isVegano;
	
	public Alimentare(int codice,String descrizione,double prezzoUnitario,LocalDate dataDiScadenza, boolean isVegano) {
		super(codice,descrizione,prezzoUnitario);
		this.dataDiScadenza = dataDiScadenza;
		this.isVegano = isVegano;
	}
	
	public void infoProdotto() {
		System.out.println("Codice prodotto: " + getCodice());
		System.out.println("Descrizione prodotto: " + getDescrizione());
		System.out.println("Prezzo unitario: " + getPrezzoUnitario());
		
		System.out.println("Data di scadenza: "+ dataDiScadenza);
		System.out.println("E' vegano: " + isVegano);
		
		
	}

}
