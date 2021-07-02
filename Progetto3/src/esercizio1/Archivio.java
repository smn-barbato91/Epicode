package esercizio1;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Archivio {

	private List<Pubblicazione> archivio = new ArrayList<Pubblicazione>();

	public void aggiungiElemento(Pubblicazione p) {

		archivio.add(p);
	}

	public String cercaPerCodice(String isbn) {
		for (Pubblicazione p : archivio) {
			if (isbn.equals(p.getCodiceIsbn())) {
				return p.stampaCaratteristiche();
			}
		}

		return null;
	}

	public String rimuoviElemento(String c) {
		for (Pubblicazione p : archivio) {
			if (c.equals(p.getCodiceIsbn())) {
				archivio.remove(p);
				return "Elemento rimosso";
			}
		}
		return null;
	}

	public List filtraPerAnno(int anno) {
		List<String> dati = archivio.stream().filter(i -> i.getAnnoDiPubblicazione() == anno)
				.map(p -> p.stampaCaratteristiche()).collect(Collectors.toList());

		return dati;
	}

	public List filtraPerAutore(Autore a) {
		List<String> dati = archivio.stream().filter(i -> i.stampaCaratteristiche().contains(a.getCognome()))
				.map(p -> p.stampaCaratteristiche()).collect(Collectors.toList());
		return dati;
	}

	public void stampaArchivio() {
		for (Pubblicazione p : archivio) {
			System.out.println(p.stampaCaratteristiche());
		}
	}

	public void scriviFile() throws IOException {

		File datiRivista = new File("libreria.txt");

		String dati = archivio.stream().map(p -> p.toString()).collect(Collectors.joining("@"));

		FileWriter fw = new FileWriter(datiRivista);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(dati);
		bw.flush();
		bw.close();

	}

	public void leggiFile() throws IOException { // Non sono riuscito ad utilizzare la libreria apache

		File datiRivista = new File("archivio/riviste.txt");
		String dati = archivio.stream().map(p -> p.toString()).collect(Collectors.joining("@"));

		char[] in = new char[dati.length()];
		int size = 0;

		File file = new File("libreria.txt");
		FileReader fr = new FileReader(file);
		size = fr.read(in);

		System.out.print("Il contenuto del file è il seguente:\n");

		for (int i = 0; i < size; i++)
			System.out.print(in[i]);
		fr.close();

	}

}
