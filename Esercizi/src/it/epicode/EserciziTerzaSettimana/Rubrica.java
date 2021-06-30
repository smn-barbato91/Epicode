package it.epicode.EserciziTerzaSettimana; //prova

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Rubrica {

	private Map<String, String> listaContatti = new TreeMap<String, String>();

//	public Map<String, String> getListaContatti() {
//		return this.listaContatti;
//	}

	public String creaNuovoContatto(String key, String value) {

		String oldValue = listaContatti.put(key, value);

		return oldValue;
	}

	public String cancellaContatto(String key) {

		String removedValue = listaContatti.remove(key);

		return removedValue;

	}

	public String searchNameByNumber(String numero) {

		for (Map.Entry<String, String> n : listaContatti.entrySet()) {
			if (n.getValue().equals(numero)) {
				return n.getKey();
			}
		}
		return null;
	}

	public String searchNumberByName(String nome) {

		return listaContatti.get(nome);
	}

	public void stampaRubrica() {
		for (Map.Entry<String, String> lista : listaContatti.entrySet()) {
			System.out.print(lista.getKey() + ":");
			System.out.println(lista.getValue());
		}
	}

}
