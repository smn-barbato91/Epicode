package esercizio1;

import java.util.Scanner;

public class LettoreMultimediale {
	private final static int DIMENSIONE_MAX = 5;
	private ElementoMultimediale[] elementi = new ElementoMultimediale[DIMENSIONE_MAX];
	private Scanner tastiera = new Scanner(System.in);


	public void caricaElementi() {

		String risposta = "";

		for (int i = 0; i < elementi.length; i++) {
			System.out.println("Cosa vuoi inserire nello slot " + (i + 1) + "?(Registrazione audio,immagine,video)");
			risposta = tastiera.nextLine();

			if (risposta.equalsIgnoreCase("Registrazione audio")) {
				RegistrazioneAudio ra = creaRegistrazioneAudio();
				elementi[i] = ra;

			} else if (risposta.equalsIgnoreCase("Video")) {
				elementi[i] = creaVideo();

			} else if (risposta.equalsIgnoreCase("Immagine")) {
				elementi[i] = creaImmagine();

			}

			tastiera.nextLine();

		}
	}
	
	public void esegui() {
		int ris = 0;

		do {
			System.out.println("Quale oggetto vuoi eseguire?(1-2-3-4-5), premi 0 per uscire");
			ris = tastiera.nextInt();

			switch (ris) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				elementi[ris - 1].execute();
				break;
			default:
				System.out.println("Arrivederci");
			}

		} while (ris != 0);

		tastiera.close();
	}
	
	private RegistrazioneAudio creaRegistrazioneAudio() {
		System.out.println("Specificare Titolo, Durata, Volume");
		String titolo = tastiera.nextLine();
		int durata = tastiera.nextInt();
		int volume = tastiera.nextInt();
		RegistrazioneAudio r = new RegistrazioneAudio(titolo, durata, volume);
		return r;
	}

	private Video creaVideo() {
		System.out.println("Specificare Titolo, Durata, Volume, Luminosità");
		String titolo = tastiera.nextLine();
		int durata = tastiera.nextInt();
		int volume = tastiera.nextInt();
		int luminosita = tastiera.nextInt();
		return new Video(titolo, durata, volume, luminosita);

	}

	private Immagine creaImmagine() {
		System.out.println("Specificare Titolo, Luminosità");
		String titolo = tastiera.nextLine();
		int luminosita = tastiera.nextInt();
		return new Immagine(titolo, luminosita);
	}

}
