package esercizio1;

public class Rivista extends Pubblicazione {

	private Periodicita periodicita;

	public Rivista(String codiceIsbn, String titolo, int annoDiPubblicazione, int numeroPagine,
			Periodicita periodicita) {
		super(codiceIsbn, titolo, annoDiPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public enum Periodicita {
		SETTIMANALE, MENSILE, SEMESTRALE;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}

	@Override
	public String stampaCaratteristiche() {
		return titolo + " " + " " + annoDiPubblicazione + " " + getNumeroPagine() +" " + periodicita;
	}
	
	@Override
	public String toString() {
		return stampaCaratteristiche();
	}

}
