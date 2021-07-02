package esercizio1;

public class Rivista {

	private String codiceIsbn;
	protected String titolo;
	protected int annoDiPubblicazione;
	private int numeroPagine;
	private Periodicita periodicita;

	public Rivista(String codiceIsbn, String titolo, int annoDiPubblicazione, int numeroPagine) {
		this.codiceIsbn = codiceIsbn;
		this.titolo = titolo;
		this.annoDiPubblicazione = annoDiPubblicazione;
		this.numeroPagine = numeroPagine;
	}

	public String getCodiceIsbn() {
		return codiceIsbn;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
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

	public String stampaCaratteristiche() {
		return titolo + " " + annoDiPubblicazione + " " + periodicita;
	}

	public static Rivista fromString(String s) {
		String[] elements = s.split("@");
		Rivista r = new Rivista(elements[0], elements[1], Integer.valueOf(elements[2]), Integer.valueOf(elements[3]));
		return r;
	}

	@Override
	public String toString() {
		return stampaCaratteristiche();
	}
}
