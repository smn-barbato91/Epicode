package esercizio1;

public class RegistrazioneAudio extends Riproducibile {
	int volume; // valore positivo

	public RegistrazioneAudio(String titolo, int durata, int volume) {
		super(titolo, durata);
		this.volume = volume;

	}
	@Override
	public void abbassaVolume() {
		this.volume = volume - 1;
	}
	@Override
	public void alzaVolume() {
		this.volume = volume + 1;
	}
	

	@Override
	public void play() {

		String puntoEsclamativo = "";
		for(int i = 0; i < volume; i++) {
			puntoEsclamativo = puntoEsclamativo +"!";
		}
		for (int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo() +(puntoEsclamativo));
		}

	}

	
}
