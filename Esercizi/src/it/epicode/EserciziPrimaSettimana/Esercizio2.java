package it.epicode.EserciziPrimaSettimana;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci un intero positivo: ");
		int numero = tastiera.nextInt();
		System.out.println(ritornaFattoriale(numero) + "\n");
		long[] fibonacci = serieFibonacci(numero);
		

		for (int i = 1; i < fibonacci.length; i++) {
			System.out.print(fibonacci[i] + " ");
		}
		
		System.out.println("\n");
		stampa(numero);
		

	}

	public static long ritornaFattoriale(int n) {

		long fattoriale = 1;

		for (int i = 1; i < n; i++) {
			fattoriale *= (i + 1);
		}
		return fattoriale;
	}

	public static int numFibonacci(int n) { //Calcola il num di fibonacci corrispondente ad n.

		if (n == 0) 
			return 0;
		else if (n == 1) // il primo numero è sempre 1
			return 1;
		else //Se n >= 2
			return numFibonacci(n - 1) + numFibonacci(n - 2); //Utilizzo la ricorsione per descrivere il modo in cui viene incrementato il valore di n.

	}

	public static long[] serieFibonacci(int num) {

		long[] array = new long[num + 1]; //La dimensione è num + 1 altrimenti si perderebbe l'ultimo numero di fibonacci.

		for (int i = 0; i < array.length; i++) {
			array[i] = numFibonacci(i);
		}
		return array;
	}

	public static void stampa(int n) {

		for (int i = 1; i <= n; i++) {

			boolean tre = (i % 3) == 0;
			boolean cinque = (i % 5) == 0;

			if ((i % 15) == 0) {
				System.out.print("fizzbuzz" + " ");
			} else if (cinque) {
				System.out.print("buzz" + " ");
			} else if (tre) {
				System.out.print("fizz" + " ");
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
