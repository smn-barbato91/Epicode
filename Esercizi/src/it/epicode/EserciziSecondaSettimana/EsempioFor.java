package it.epicode.EserciziSecondaSettimana;

import java.util.Scanner;

public class EsempioFor {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci un intero: ");
		int n = tastiera.nextInt();

		System.out.println("Conto alla rovescia: ");

		for (int i = n; i >= 0; i--) {

			System.out.println(i);
		}

	}

}
