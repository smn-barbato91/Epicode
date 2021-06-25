package esercizio1;

public abstract class ElementoMultimediale {
	private String titolo;
	
	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public abstract void play();
	
	
}
