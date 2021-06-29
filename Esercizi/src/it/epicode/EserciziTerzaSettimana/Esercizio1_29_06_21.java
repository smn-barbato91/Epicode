package it.epicode.EserciziTerzaSettimana;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Esercizio1_29_06_21 {

	public static void main(String[] args) {

		System.out.println("Inserisci il numero di parole che ti serve");
		Scanner tastiera = new Scanner(System.in);
		int n = tastiera.nextInt();
		tastiera.nextLine();
		Set<String> gruppo = new HashSet();
		Set<String> rifiutate = new HashSet();

		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci parola " + (i + 1));
			String parola = tastiera.nextLine();
			if (gruppo.add(parola) == false) {
				rifiutate.add(parola);
			} else {
				gruppo.add(parola);
			}

		}

		

		System.out.println("Ci sono " + gruppo.size() + " parole distinte e sono: ");
		
		for (String s : gruppo) {
			System.out.println(s);

		}
		
		System.out.println("Ci sono " + rifiutate.size() + " parole duplicate e sono:");
		
		for (String s : rifiutate) {
			System.out.println(s);

		}

	}


}
