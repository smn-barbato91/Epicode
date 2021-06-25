package it.epicode.EserciziSecondaSettimana;

import java.time.LocalDate;

import it.epicode.EserciziSecondaSettimana.Lavoratore.statoLavoratore;
import it.epicode.EserciziSecondaSettimana.Studente.statoStudente;

public class StartPersona {
	public static void main(String[] args) {
		Studente s = new Studente("Bruno","LiegiBastonLiegi",12345,"Fisica",statoStudente.IN_CORSO);
		s.infoStudente();
		Lavoratore l = new Lavoratore("Maccio", "Capatonda","MCT1234","BillyBallo",LocalDate.now(),statoLavoratore.IN_MALATTIA);
		l.infoLavoratore();
	}
}
