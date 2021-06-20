package it.epicode.EserciziPrimaSettimana;

public class StartBanca {

	public static void main(String[] args) {

		Cliente c = new Cliente("Mario", "Rossi");
		ContoCorrente co1 = new ContoCorrente(100); // Mario Rossi ha attualmente due conti.
		ContoCorrente co2 = new ContoCorrente(200);

		c.aggiungiConto(co1);
		c.aggiungiConto(co2);

		ContoCorrente r = c.rimuoviConto(0); // Il primo conto viene rimosso
		System.out.println(r.saldo);

		System.out.println("Il saldo totale del cliente " + c.nome + " " + c.cognome + " è:" + c.getSaldoTotole());

		ContoCorrente co3 = new ContoCorrente(1000);

		c.aggiungiConto(co3);

		System.out.println("Il saldo totale del cliente " + c.nome + " " + c.cognome + " è:" + c.getSaldoTotole());

		c.aggiungiConto(r);
		System.out.println("Il saldo totale del cliente " + c.nome + " " + c.cognome + " è:" + c.getSaldoTotole());

		ContoCorrente co4 = new ContoCorrente(10000);
		
		boolean aggiunto = c.aggiungiConto(co4);//ritorna false perchè non puo' aggiungere un quarto elemento.
		
		System.out.println(aggiunto);
		
		System.out.println("Il saldo totale del cliente " + c.nome + " " + c.cognome + " è:" + c.getSaldoTotole());
		
		if (c.conti[1] != null) {
			System.out.println(c.conti[1].saldo);
		}else {
			System.out.println("Il secondo conto non esiste");
		}
		
		
	}

}
