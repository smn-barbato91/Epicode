package it.epicode.EserciziSecondaSettimana;

public class GestioneDipendenti {
	public static void main(String[] args) {

		Dipendente d1 = new Dipendente("KMJHGF254G", Dipartimento.PRODUZIONE);
		Dipendente d2 = new Dipendente("ABCDEF1234", Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente d3 = new Dipendente("HHHTTT1240", Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente d4 = new Dipendente("LMOPO56678", Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		d2.promuovi(); //ora d2 passa da operaio a impiegato
		d3.promuovi();// d3 passa da impiegato a quadro
		
		d2.stampaDipendente();
		d3.stampaDipendente();
		
		double somma = calcolaPaga(d1,5) + calcolaPaga(d2,5) + calcolaPaga(d3,5) + calcolaPaga(d4,5);
		
		System.out.println("La somma degli stipendi dei quattro impiegati,compresi gli straordinari è : " + somma);
		
	}
	
	static double calcolaPaga(Dipendente d) {
		return d.getStipendio();
	}

	public static double calcolaPaga(Dipendente d, int oreStraordinario) {

		return d.getStipendio() + oreStraordinario * d.getImportoOrarioStraordinario();
	}

}
