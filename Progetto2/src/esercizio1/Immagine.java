package esercizio1;

public class Immagine extends NonRiproducibile {

	public Immagine(String titolo, int luminosita) {
		super(titolo, luminosita);

	}

	public int getLuminosita() {
		return this.luminosita;
	}

	public void aumentaLuminosita() {
		this.luminosita = luminosita + 1;
	}

	public void diminuisciLuminosita() {
		this.luminosita = luminosita - 1;
	}
		

	@Override
	public void play() {
		show();
		
	}

	

}
