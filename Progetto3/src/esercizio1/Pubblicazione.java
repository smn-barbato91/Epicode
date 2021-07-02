package esercizio1;

import esercizio1.Rivista.Periodicita;

public abstract class Pubblicazione {
	private String codiceIsbn;
	protected String titolo;
	protected int annoDiPubblicazione;
	private int numeroPagine;

	public Pubblicazione(String codiceIsbn, String titolo, int annoDiPubblicazione, int numeroPagine) {
		this.codiceIsbn = codiceIsbn;
		this.titolo = titolo;
		this.annoDiPubblicazione = annoDiPubblicazione;
		this.numeroPagine = numeroPagine;
	}

	public String getCodiceIsbn() {
		return codiceIsbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}

	public abstract String stampaCaratteristiche();

	public int getNumeroPagine() {
		return numeroPagine;
	}
	

}
