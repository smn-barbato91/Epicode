package esercizio1;

public class Libro extends Pubblicazione{
	private Autore a;
	private String genere;
	
	public Libro(String codiceIsbn, String titolo, int annoDiPubblicazione, int numeroPagine, Autore a, String genere) {
		super(codiceIsbn,titolo,annoDiPubblicazione,numeroPagine);
		this.a = a;
		this.genere = genere;
	}
	@Override
	public String stampaCaratteristiche() {
		return titolo + " " + annoDiPubblicazione + " " + a.getNome() + " " +a.getCognome() + " Genere: " + genere;
	}
	
	public Autore getAutore() {
		return this.a;
	}
	
	@Override
	public String toString() {
		return stampaCaratteristiche();
	}
}

