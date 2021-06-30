package it.epicode.EserciziTerzaSettimana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Esercizio2_29_06_21 {

	public static void main(String[] args) {

		List<Integer> lista = aggiornaLista(10);

		System.out.println(lista);
//		listaReverse(lista);
//		System.out.println(lista);
		listaParioDispari(lista, true);

//		System.out.println(lista);

	}

	public static List<Integer> aggiornaLista(int n) {

		List<Integer> listaOrdinata = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			listaOrdinata.add((int) (Math.random() * 101));

		}
		Collections.sort(listaOrdinata);

		return listaOrdinata;
	}

	public static List<Integer> listaReverse(List<Integer> lista) {

		List<Integer> reverse = new ArrayList<Integer>(lista);

		Collections.reverse(reverse);

		lista.addAll(reverse);

//		lista.addAll(lista);

//		for(int i = 0; i < lista.size(); i ++) {
//			lista.add(lista.get(i));
//		}

//		int last = lista.size()-1;
//		for(int i = last; i >= 0 ; i--) {
//			lista.add(lista.get(i));
//		}

		return lista;
	}

	public static void listaParioDispari(List<Integer> lista, boolean pari) {
//		int start = 1;
//		if (pari) {
//			start = 0;
//		}
//		for (int i = start; i < lista.size(); i += 2) {
//			System.out.println(lista.get(i));
//		}

		for (int i = pari?0:1; i < lista.size(); i += 2) { //operatore ternario
			System.out.println(lista.get(i));
		}
		
		
	}

}
