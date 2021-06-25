package esercizio1;

import java.util.Scanner;

public class LettoreMultimediale {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		ElementoMultimediale[] elementi = new ElementoMultimediale[5];
		String risposta = "";

		for (int i = 0; i < elementi.length; i++) {
			System.out.println("Cosa vuoi inserire nello slot " + (i + 1) + "?(Registrazione audio,immagine,video)");
			risposta = tastiera.nextLine();

			if (risposta.equalsIgnoreCase("Registrazione audio")) {

				System.out.println("Specificare Titolo, Durata, Volume");
				String titolo = tastiera.nextLine();
				int durata = tastiera.nextInt();

				int volume = tastiera.nextInt();

				elementi[i] = new RegistrazioneAudio(titolo, durata, volume);

			} else if (risposta.equalsIgnoreCase("Video")) {

				System.out.println("Specificare Titolo, Durata, Volume, Luminosità");
				String titolo = tastiera.nextLine();
				int durata = tastiera.nextInt();

				int volume = tastiera.nextInt();

				int luminosita = tastiera.nextInt();

				elementi[i] = new Video(titolo, durata, volume, luminosita);

			} else if (risposta.equalsIgnoreCase("Immagine")) {
				System.out.println("Specificare Titolo, Luminosità");
				String titolo = tastiera.nextLine();
				int luminosita = tastiera.nextInt();

				elementi[i] = new Immagine(titolo, luminosita);
			}

			tastiera.nextLine();

		}

		int ris = 0;

		do {
			System.out.println("Quale oggetto vuoi eseguire?(1-2-3-4-5), premi 0 per uscire");
			ris = tastiera.nextInt();

			switch (ris) {
			case 1:
				elementi[0].play();
				break;
			case 2:
				elementi[1].play();
				break;
			case 3:
				elementi[2].play();
				break;
			case 4:
				elementi[3].play();
				break;
			case 5:
				elementi[4].play();
				break;
			default:
				System.exit(0);

			}

		} while (ris != 0);

		tastiera.close();
	}
}
