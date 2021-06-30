package it.epicode.EserciziTerzaSettimana; //prova1

public class StartRubrica {
	
	public static void main(String[] args) {

		Rubrica r = new Rubrica();

		r.creaNuovoContatto("Pippo", "345654333");
		r.creaNuovoContatto("Pluto", "3332221111");
		r.creaNuovoContatto("Paperino", "34786541209");
		r.creaNuovoContatto("Topolino", "0687654321");
		r.creaNuovoContatto("Simone", "3461242276");
		r.creaNuovoContatto("Franco", "3334455666");
		r.creaNuovoContatto("Ciccio", "34266671823");

		System.out.println(r.searchNameByNumber("345654333"));
		System.out.println(r.searchNumberByName("Topolino"));
//		r.cancellaContatto("Topolino");
//		r.cancellaContatto("Franco");

		r.stampaRubrica();

	}
}
