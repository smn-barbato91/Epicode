package it.epicode.EserciziPrimaSettimana;

import java.util.Scanner;

public class ContaPoveri {
	public static void main(String[] args) {
		System.out.println("Inserisci il numero di famiglie da controllare");
		Scanner tastiera = new Scanner(System.in);
		int k = tastiera.nextInt();
		Famiglia[] famiglie = new Famiglia[k];

		for (int i = 0; i < k; i++) {
			System.out.println("Inserisci il reddito e il numero di componenti della famiglia " + i);
			Famiglia f = new Famiglia(tastiera.nextDouble(), tastiera.nextInt());
			famiglie[i] = f;

		}
		for(int i = 0; i < famiglie.length; i++) {
			System.out.println("Inserisci il costo delle spese di casa della famiglia " +i);
			double costoCasa = tastiera.nextDouble();
			System.out.println("Inserisci il costo medio del cibo (per ogni persona) della famiglia " +i);
			double costoCibo = tastiera.nextDouble();
			costoCibo = costoCibo * famiglie[i].getDimensione();
			famiglie[i].povera(costoCasa,costoCibo);
		}

	}
}
