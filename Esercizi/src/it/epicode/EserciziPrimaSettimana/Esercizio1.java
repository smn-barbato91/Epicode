package it.epicode.EserciziPrimaSettimana;
import java.util.Scanner;

public class Esercizio1 {
	
	public static void main (String[] args) {
		
		int x1 = 1;
		int x2 = 2;
		System.out.println(x1 + " " + x2);
		scambia(x1,x2);
		System.out.println(x1 + " " + x2);
		int[] n = new int [5];
		int v;
		
		
		Scanner tastiera = new Scanner(System.in);
		
		for(int i = 0; i < n.length; i++) { 
			System.out.println("Inserisci il valore " + i + " : ");
			n[i] = tastiera.nextInt();
		}
		
		System.out.println("Inserisci il valore di controllo :");
		v = tastiera.nextInt();
		tastiera.close();
		
		System.out.println("Trovato = " + cercaValore(n,v));
		System.out.println("Trovato in posizione " +trovaPosizione(n,v));
		System.out.println("Il valore massimo è " + ricercaMax(n));
		System.out.println("Il valore minimo è " + ricercaMin(n));

		
		
	}
	
	public static void scambia(int x1, int x2) {
		
		int appoggio = x1;
		
		x1 = x2;
		
		x2 = appoggio;
		
	}
	
	public static boolean cercaValore(int[] array, int valoreDiControllo) {
		
		boolean trovato = false;
		
		for(int i = 0; i < array.length ; i++) {
			if (array[i] == valoreDiControllo) 
				trovato = true;
			    break;            
		}
				
			
		return trovato;	
	}
	
	
	public static int trovaPosizione(int[] array, int valoreDiControllo) {
		
		int posizione = -1;
		
		for(int i = 0; i < array.length; i++) { 
			
			if (array[i] == valoreDiControllo) 
				posizione = i;
			    break;
		}
				
				
		return posizione;
	}
	
	
	public static int ricercaMax(int[] array) {
		
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
				
			if (array[i] > max)
				max = array[i];
		}
		
		return max;
	}
	
	
	public static int ricercaMin(int[] array) {
		
		int min = array[0]; 
		
		for (int i = 1; i < array.length; i++) {
	
				if (array[i] < min)
				min = array[i];
					
		}
		
		return min;
		
	}

}
