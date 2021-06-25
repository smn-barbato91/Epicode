package it.epicode.EserciziSecondaSettimana;

public class Officina {
	
	private static final int numPosti = 4;

	private Macchinario[] postoMacchina = new Macchinario[numPosti];

	public boolean ripara(Macchinario m) {

		for (int i = 0; i < numPosti; i++) {

			if (postoMacchina[i] == null) {
				postoMacchina[i] = m;

				Lavorazione lav = new Lavorazione(200);
				m.aggiungiLavorazione(lav);
				return true;

			}

		}
		System.out.println("Capienza massima");
		return false;
	}

	public void liberaPosto(Macchinario m) {

		for (int i = 0; i < numPosti; i++) {
			if (postoMacchina[i] == null) {
				continue;
			} else if (postoMacchina[i].equals(m)) {

				postoMacchina[i] = null;
			}
		}

	}

	public double getCostoTot(Macchinario m) {
		double tot = 0;
		for (int i = 0; i < m.lavorazioni.length; i++) {
			if (m.lavorazioni[i] != null) {
				tot = tot + m.lavorazioni[i].getCosto();
			} else {
				continue;
			}

		}
		return tot;
	}

	public Macchinario[] getMacchine() {
		return postoMacchina;
	}

	public static int getNumposti() {
		return numPosti;
	}
}