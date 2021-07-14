package it.epicode.EserciziQuartaSettimana;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class RegistroImpiegati {

	private Map<Integer, Impiegato> registro;// Integer = id impiegato;
	private static final double MAX_STIPENDIO_MENSILE = 150000;

	public RegistroImpiegati(Map<Integer, Impiegato> resgistro) {
		this.registro = resgistro;
	}

	public Impiegato getImpiegatoPiuPagato() {
		double max = 0;
		Impiegato i = null;
		if(registro.isEmpty()) {
			return null;
		}
		for (Map.Entry<Integer, Impiegato> coppia : registro.entrySet()) {
			if (coppia.getValue().getStipendio() > max) {
				max = coppia.getValue().getStipendio();
				i = coppia.getValue();

			}
		}
		return i;

	}

	public Impiegato getImpiegatoMenoPagato() {
		Impiegato i = null;

		double min = MAX_STIPENDIO_MENSILE;
		for (Map.Entry<Integer, Impiegato> coppia : registro.entrySet()) {

			if (coppia.getValue().getStipendio() < min) {
				min = coppia.getValue().getStipendio();
				i = coppia.getValue();
			}
		}
		return i;
	}

	public Impiegato getDonnaPiuPagata() {
		Impiegato i = null;
		double max = 0;
		for (Map.Entry<Integer, Impiegato> coppia : registro.entrySet()) {
			if (coppia.getValue().getSesso() == 'F' && coppia.getValue().getStipendio() > max) {
				max = coppia.getValue().getStipendio();
				i = coppia.getValue();
			}
		}
		return i;
	}

	public Impiegato getDonnaMenoPagata() {
		Impiegato i = null;
		double min = MAX_STIPENDIO_MENSILE;
		for (Map.Entry<Integer, Impiegato> coppia : registro.entrySet()) {
			if (coppia.getValue().getSesso() == 'F' && coppia.getValue().getStipendio() < min) {
				min = coppia.getValue().getStipendio();
				i = coppia.getValue();
			}
		}
		return i;
	}

	public double getMediaStipendi() {
		double somma = 0;
		int contatore = 0;
		for (Map.Entry<Integer, Impiegato> coppia : registro.entrySet()) {
			somma += coppia.getValue().getStipendio();
			contatore++;
		}
		return somma / contatore;
	}

	public void aggiungiImpiegato(Impiegato i) {
		registro.put(i.getId(), i);
	}

}
