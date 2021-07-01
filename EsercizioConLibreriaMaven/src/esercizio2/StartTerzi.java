package esercizio2;

import java.util.Arrays;

public class StartTerzi {

	public static void main(String[] args) throws InterruptedException {
		
		
		int[] a = new int[3000];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 +1);
		}
		Arrays.sort(a);
	
		
		PrimoTerzoArray p = new PrimoTerzoArray(a);
		SecondoTerzoArray p2 = new SecondoTerzoArray(a);
		UltimoTerzoArray p3 = new UltimoTerzoArray(a);
		
	    
		
		Thread primo = new Thread(p);
		Thread secondo = new Thread(p2);
		Thread terzo = new Thread(p3);
		
		
		
		primo.start(); //Inizio ad eseguirli contemporaneamente
		secondo.start();
		terzo.start();
		primo.join();  // Aspetto che finiscano per continuare con la main in riga 38
		secondo.join();
		terzo.join();
		
		
		int totale = p.getTotale() + p2.getTotale() + p3.getTotale();
		System.out.println("Il totale è " + totale);
		
		
		
		
		
		

	}

}
