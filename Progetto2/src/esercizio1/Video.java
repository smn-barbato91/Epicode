package esercizio1;

public class Video extends Riproducibile {
	private int luminosita;
	private int volume;

	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata);
		this.luminosita = luminosita;
		this.volume = volume;

	}

	public int getLuminosita() {
		return this.luminosita;
	}

	@Override
	public void alzaVolume() {
		this.volume = volume + 1;
	}

	@Override
	public void abbassaVolume() {
		this.volume = volume - 1;
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
		String puntoEsclamativo = "";

		for (int i = 0; i < luminosita; i++) {
			lum = lum + "*";
		}
		for (int i = 0; i < volume; i++) {
			puntoEsclamativo = puntoEsclamativo + "!";
		}
		for (int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo() + (puntoEsclamativo) + lum);
		}

	}

}
