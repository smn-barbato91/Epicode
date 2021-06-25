package it.epicode.EserciziSecondaSettimana;

import java.util.Scanner;
import java.time.LocalDate;

public class StartOfficina {
	public static void main(String[] args) {

		Officina officina = new Officina();

		Motozappa m1 = new Motozappa("Ford", LocalDate.now(), 2);
		Motozappa m2 = new Motozappa("Ford", LocalDate.now(), 2);
		Motozappa m3 = new Motozappa("Ford", LocalDate.now(), 2);
		Motozappa m4 = new Motozappa("Ford", LocalDate.now(), 2);
		Motozappa m5 = new Motozappa("Ford", LocalDate.now(), 2);

		officina.ripara(m1);
		officina.ripara(m2);
		officina.ripara(m3);
		officina.ripara(m4);
		
		

		officina.liberaPosto(m1);
		officina.ripara(m1);
		officina.liberaPosto(m1);
		officina.ripara(m1);
//		
//		officina.liberaPosto(m4);
//		officina.ripara(m1);
//		officina.liberaPosto(m2);
//		officina.ripara(m1);

		System.out.println(officina.getCostoTot(m1));
		System.out.println(officina.getCostoTot(m2));
		System.out.println(officina.getCostoTot(m3));
		System.out.println(officina.getCostoTot(m4));

	}

}
