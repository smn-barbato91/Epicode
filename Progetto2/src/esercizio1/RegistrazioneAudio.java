package esercizio1;

public class RegistrazioneAudio extends Riproducibile {

	public RegistrazioneAudio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);

	}

	@Override
	public void play() {

		String puntiEsclamativi = "";
		for (int i = 0; i < getVolume(); i++) {
			puntiEsclamativi = puntiEsclamativi + "!";
		}
		for (int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo() + (puntiEsclamativi));
		}

	}

}
