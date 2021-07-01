package esercizio3;

import java.io.IOException;

public class Start {

	public static void main(String[] args) {

		

		RegistroPresenze registro = new RegistroPresenze();

//		registro.aggiungiPresenza(new Presenza("Mario Rossi", 4));
//		registro.aggiungiPresenza(new Presenza("Pippo", 8));
//		registro.aggiungiPresenza(new Presenza("Luca Verdi", 2));
//		registro.aggiungiPresenza(new Presenza("Maria Neri", 3));
//		registro.aggiungiPresenza(new Presenza("Giorgio", 15));
//		registro.aggiungiPresenza(new Presenza("Pluto", 11));

		

		try {

//			registro.scriviFile();
			registro.leggiFile();
			registro.stampaRegistro();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
