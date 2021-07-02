package esercizio1;

import java.io.IOException;

import esercizio1.Rivista.Periodicita;

public class StartBiblioteca {

	public static void main(String[] args) throws IOException {

		Archivio archivio = new Archivio();
		
		Pubblicazione romanzo = new Libro("I556SXV", "IT", 1989, 980, new Autore("Stephen", "King"), "Horror");
		Pubblicazione fumetto = new Rivista("Y789FNB", "Batman", 2020, 50,Periodicita.SETTIMANALE);
		Pubblicazione romanzo2 = new Libro("55678XW", "Sete", 2020, 420, new Autore("Jo", "Nesbo"), "Thriller");
		Pubblicazione romanzo3 = new Libro("I556GHDD", "L'ombra dello scorpione", 1991, 900, new Autore("Stephen", "King"),
				"Horror/Fantasy");
		Pubblicazione fumetto2 = new Rivista("UIPL1234", "Spiderman", 2020, 40, Periodicita.MENSILE);
		Pubblicazione fumetto3 = new Rivista("HGGTERFG", "Hulk", 2019, 30, Periodicita.SEMESTRALE);

		
		

		Autore a = new Autore("King");
		Autore b = new Autore("Nesbo");
		Autore c = new Autore("Nessuno");

		archivio.aggiungiElemento(romanzo);
		archivio.aggiungiElemento(romanzo2);
		archivio.aggiungiElemento(fumetto);
		archivio.aggiungiElemento(romanzo3);
		archivio.aggiungiElemento(fumetto2);
		archivio.aggiungiElemento(fumetto3);
		
		
		

		
//		System.out.println(archivio.rimuoviElemento("I556GHDD"));
//		System.out.println(archivio.rimuoviElemento("I556SXV"));
//		System.out.println(archivio.rimuoviElemento("55678XW"));
		
//		System.out.println(archivio.filtraPerAnno(2019));
//		System.out.println(archivio.filtraPerAutore(a)); //E' sufficiente il cognome
//		System.out.println(archivio.cercaPerCodice("UIPL1234"));

		archivio.scriviFile();
		archivio.leggiFile();

//		

		//archivio.stampaArchivio();

	}

}
