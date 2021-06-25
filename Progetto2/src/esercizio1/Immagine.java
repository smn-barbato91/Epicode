package esercizio1;

public class Immagine extends NonRiproducibile {

	private int luminosita;
	
	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita= luminosita;
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
	public void execute() {
		show();
		
	}

	@Override
	public void show() {
		String lum = "";
		for (int i = 0; i < luminosita; i++) {
			lum = lum + "*";
		}
		System.out.println(getTitolo() + lum);
		
	}

	

}
