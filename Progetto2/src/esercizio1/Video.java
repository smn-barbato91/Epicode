package esercizio1;

public class Video extends Riproducibile {
	private int luminosita;
	

	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata,volume);
		this.luminosita = luminosita;
		

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

		String lum = "";
		String puntiEsclamativi = "";

		for (int i = 0; i < luminosita; i++) {
			lum = lum + "*";
		}
		for (int i = 0; i < getVolume(); i++) {
			puntiEsclamativi = puntiEsclamativi + "!";
		}
		for (int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo() + (puntiEsclamativi) + lum);
		}

	}

}
