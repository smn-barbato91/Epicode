package it.epicode.EserciziTerzaSettimana;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Rubrica {
	private Map<String, String> listaContatti = new HashMap<String, String>();

	public Map<String, String> getListaContatti() {
		return this.listaContatti;
	}

	public boolean creaNuovoContatto(String key, String value) {

		listaContatti.put(key, value);

		return true;
	}

	public boolean cancellaContatto(String key) {

		if (listaContatti.remove(key) != null) {
			return true;
		}

		return false;

	}

	public String searchNameByNumber(String numero) {

		for (Map.Entry<String, String> n : listaContatti.entrySet()) {
			if (n.getValue() == numero) {
				return n.getKey();
			}
		}
		return "Nessun risultato trovato";
	}

	public String searchNumberByName(String nome) {

		for (Map.Entry<String, String> n : listaContatti.entrySet()) {
			if (n.getKey() == nome) {
				return n.getValue();
			}
		}
		return "Nessun risultato trovato";
	}

	public void stampaRubrica() {
		for (Map.Entry<String, String> lista : listaContatti.entrySet()) {
			System.out.print(lista.getKey() + ":");
			System.out.println(lista.getValue());
		}
	}

}
