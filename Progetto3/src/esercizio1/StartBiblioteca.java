package esercizio1;

import java.io.IOException;

import esercizio1.Rivista.Periodicita;

public class StartBiblioteca {

	public static void main(String[] args) throws IOException {

		Archivio archivio = new Archivio();
		Rivista romanzo = new Libro("I556SXV", "IT", 1989, 980, new Autore("Stephen", "King"), "Horror");
		Rivista fumetto = new Rivista("Y789FNB", "Batman", 2020, 50);
		Rivista romanzo2 = new Libro("55678XW", "Sete", 2020, 420, new Autore("Jo", "Nesbo"), "Thriller");
		Rivista romanzo3 = new Libro("I556GHDD", "L'ombra dello scorpione", 1991, 900, new Autore("Stephen", "King"),
				"Horror/Fantasy");
		Rivista fumetto2 = new Rivista("UIPL1234", "Spiderman", 2020, 40);

		fumetto.setPeriodicita(Periodicita.SETTIMANALE);
		fumetto2.setPeriodicita(Periodicita.MENSILE);

		Autore a = new Autore("King");
		Autore b = new Autore("Nesbo");
		Autore c = new Autore("Nessuno");

		archivio.aggiungiElemento(romanzo);
		archivio.aggiungiElemento(romanzo2);
		archivio.aggiungiElemento(fumetto);
		archivio.aggiungiElemento(romanzo3);
		archivio.aggiungiElemento(fumetto2);

		
//		System.out.println(archivio.rimuoviElemento("I556GHDD"));
//		System.out.println(archivio.rimuoviElemento("I556SXV"));
//		System.out.println(archivio.rimuoviElemento("55678XW"));
		
//		System.out.println(archivio.filtraPerAnno(2020));
//		System.out.println(archivio.filtraPerAutore(b)); //E' sufficiente il cognome
//		System.out.println(archivio.cercaPerCodice("UIPL1234"));

		archivio.scriviFile();
		archivio.leggiFile();

//		

	//	archivio.stampaArchivio();

	}

}
