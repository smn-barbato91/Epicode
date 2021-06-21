package it.epicode.EserciziSecondaSettimana;

import java.util.Scanner;

public class EsempioSwitch {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un intero");
		int n = tastiera.nextInt();

		switch (n) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Due");
			break;
		case 3:
			System.out.println("Tre");
			break;
		default :
			System.out.println("Numero non valido");
		}
	}

}
