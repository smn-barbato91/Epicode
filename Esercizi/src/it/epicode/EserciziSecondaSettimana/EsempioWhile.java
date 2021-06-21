package it.epicode.EserciziSecondaSettimana;

import java.util.Scanner;

public class EsempioWhile {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String s = tastiera.nextLine();
		

		while (!s.equalsIgnoreCase(":q")) {

			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i) + ",");
				
			}
			System.out.println("\n"+ "Inserisci un altra stringa(':q' per uscire): ");
			s = tastiera.nextLine();

		}
		System.out.println("Fine.");
		System.exit(0);
	}
}