package esercizio3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import org.apache.commons.io.FileUtils;

public class RegistroPresenze {

	private List<Presenza> lista = new ArrayList<Presenza>();

	public RegistroPresenze() {

	}
	

	public void scriviFile() throws IOException {

		File datiPresenze = new File("dati/presenze.txt");
		
		String dati = lista.stream().map(p -> p.toString()).collect(Collectors.joining("@"));
		
		FileUtils.writeStringToFile(datiPresenze, dati, "UTF-8");

	}

	public void leggiFile() throws IOException {
		lista.clear();
		File datiPresenze = new File("dati/presenze.txt");

		String readFileToString = FileUtils.readFileToString(datiPresenze, "UTF-8");
//		String[] coppieNomeNumero = readFileToString.split("@"); //sono separate da @
//		
//		for(String s : coppieNomeNumero) {
//			String[] elementiPresenza = s.split("#"); // ogni nome è separato dai giorni
//			Presenza p = new Presenza(elementiPresenza[0], Integer.valueOf(elementiPresenza[1]));
//			lista.add(p);
//		}
		
		lista.addAll(Stream.of(readFileToString.split("@")).map(s -> Presenza.fromString(s)).collect(Collectors.toList())); //equivalente a righe 39-42
		

		
		

		
	}

	public List<Presenza> getLista() {
		return lista;
	}

	public void setLista(List<Presenza> lista) {
		this.lista = lista;
	}

	public void aggiungiPresenza(Presenza p) {

		lista.add(p);

	}

	public void stampaRegistro() {
		for (Presenza p : lista) {
			System.out.println(p.getNome() + " -Giorni di presenza: " + p.getGiorniDiPresenza());
		}
	}

}
