package it.epicode.EserciziSecondaSettimana;
import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int[] estratti = new int[10];
		int selezione;
		
		System.out.println("Che numero vuoi giocare?");
		selezione = tastiera.nextInt();

		for (int i = 0; i < estratti.length; i++) {
			estratti[i] = (int)(Math.random() * 10) +1;
			System.out.println(estratti[i]);
			
		}
		
		for (int i = 0; i < estratti.length; i++) {
			if(selezione == estratti[i]) {
				System.out.println("Hai vinto");
				break;
			}
		}
		
		
	}

}
