package it.epicode.EserciziPrimaSettimana;

import java.util.Scanner;

public class Esercizi0103 {

	public static void main(String[] args) {
//		int n1 = 6;
//		int n2 = 2;
//		String nome1 = "Riccardo";
//		String nome2 = "Pippo";
//		
//		System.out.println(moltiplica(n1,n2));
//		System.out.println(saluta(nome1,nome2));

//		Scanner tastiera = new Scanner(System.in);
//
//		String[] frasi = new String[3];
//
//		for (int i = 0; i < frasi.length; i++) {
//			System.out.println("Inserisci la frase " + i);
//			frasi[i] = tastiera.nextLine();
//		}
//		tastiera.close();
//
//		for (int i = frasi.length - 1; i >= 0; i--) {
//			System.out.print(frasi[i]);
//			if (i != 0) {
//				System.out.print(" ");
//			}
//
//		}
		Scanner tastiera = new Scanner(System.in);

		String[] array = { "ciao", "ciccio", "come va", "bello", "brutto","mondo"};
		String aggiunta = "ADDIOS";

		String[] nuoveFrasi = inserisci(array, aggiunta);

		for (int i = 0; i < nuoveFrasi.length; i++) {
			System.out.println(nuoveFrasi[i]);
		}

	}

	public static int moltiplica(int x, int y) {
		return x * y;
	}

	public static String saluta(String s1, String s2) {

		String saluta = "Buongiorno " + s1 + ",buongiorno " + s2;
		return saluta;

	}

	public static String[] inserisci(String[] original, String aggiunta) {

		String[] nuoveStringhe = new String[original.length + 1];

//		nuoveStringhe[0] = original[0];
//		nuoveStringhe[1] = original[1];
//		nuoveStringhe[2] = aggiunta;
//		nuoveStringhe[3] = original[2];

		for (int i = 0 , j = 0; j < nuoveStringhe.length; j++) {
		
			if (j != 2) {
				
				nuoveStringhe[j] = original[i];// per ogni valore di j diverso da 2,l'elemento j di nuoveStringhe diventa la stessa di original[i].In seguito la i viene incrementata
				i++;
				
			} else {
				nuoveStringhe[j] = aggiunta; //sostituisce la stringa aggiunta in posizione 2
			}
			
		}
		

		return nuoveStringhe;

	}
}
