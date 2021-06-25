package esercizio1;

public abstract class Riproducibile extends ElementoMultimediale {

	private int durata;
	private int volume;

	public Riproducibile(String titolo, int durata,int volume) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
	}

	public int getDurata() {
		return this.durata;
	}

	public int getVolume() {
		return this.volume;
	}

	public void alzaVolume() {
		this.volume++;
	}
	
	public void abbassaVolume() {
		this.volume--;
	}
	public abstract void play();
	
	@Override
	public void execute() {
		play();
	}

}
