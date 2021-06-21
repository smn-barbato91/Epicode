package it.epicode.EserciziPrimaSettimana;

public class Famiglia {
	private double reddito;
	private int dimensione;

	public Famiglia(double reddito, int dimensione) {
		this.reddito = reddito;
		this.dimensione = dimensione;
	}

	public boolean povera(double costoCasa, double costoCibo) {
		boolean povera = false;
		if ((costoCasa + costoCibo) * dimensione > reddito / 2) {
			System.out.println("La famiglia è povera");
			povera = true;
		} else {
			System.out.println("La famiglia non è povera");
		}
		
		return povera;
	}
	
	public int getDimensione() {
		return dimensione;
	}

}
