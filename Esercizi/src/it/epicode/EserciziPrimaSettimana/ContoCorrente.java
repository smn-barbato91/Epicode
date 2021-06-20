package it.epicode.EserciziPrimaSettimana;

public class ContoCorrente { //Creando una classe l'ho potuta usare come variabile d'istanza nella classe Cliente
                             //dichiarando di fatto un array di tipo ContoCorrente di dimensione 3.
	public double saldo;

	public ContoCorrente(double saldo) {
		this.saldo = saldo;
	}

	public double deposita(double versamento) {
		
		saldo = saldo + versamento;
		return saldo;
	}

	public double ritira(double prelievo) {
		
		saldo = saldo - prelievo;
		return saldo;
	}

}
