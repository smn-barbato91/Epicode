package it.epicode.EserciziQuartaSettimana;

import java.util.HashMap;
import java.util.Map;

public class ProvaRegistro {

	public static void main(String[] args) {
		Impiegato imp1 = new Impiegato(1,"Simone","Barbato",'M',12000);
		Impiegato imp2 = new Impiegato(2,"Valentina","Ranieri",'F',1500);
		Impiegato imp3 = new Impiegato(3,"Carlo","Altamura",'M',2000);
		Impiegato imp4 = new Impiegato(4,"Maria","Lucci",'F',3050);
		Impiegato imp5 = new Impiegato(5,"Maria","Stuarda",'F',2500);
		
		RegistroImpiegati reg = new RegistroImpiegati(new HashMap<Integer,Impiegato>());
		
		reg.aggiungiImpiegato(imp1);	
		reg.aggiungiImpiegato(imp2);
		reg.aggiungiImpiegato(imp3);
		reg.aggiungiImpiegato(imp4);
		reg.aggiungiImpiegato(imp5);
		
		 ;
		System.out.println(reg.getImpiegatoPiuPagato());
		System.out.println(reg.getImpiegatoMenoPagato());
		System.out.println(reg.getDonnaMenoPagata());
		System.out.println("La media degli stipendi è "+ reg.getMediaStipendi());
		
		

	}

}
