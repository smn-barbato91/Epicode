package esercizio1;

public abstract class Riproducibile extends ElementoMultimediale {

	private int durata;
	private int volume;

	public Riproducibile(String titolo, int durata) {
		super(titolo);
		this.durata = durata;
	}

	public int getDurata() {
		return this.durata;
	}

	public int getVolume() {
		return this.volume;
	}

	public abstract void alzaVolume();

	public abstract void abbassaVolume();

}
