package it.epicode.EserciziPrimaSettimana;

import java.util.Scanner;

public class CorsoDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Corso backend = new Corso("Backend Dev", 450, "molto alto", 4000);
		Docente primoDocente = new Docente("Riccardo", "Audano", true);
		Edizione primaEdizione = new Edizione(backend, "BE0321", "14/06/21", "17/09/21", primoDocente);

		System.out.println("Quanti studenti ci sono?");
		int numero = in.nextInt();
		while (numero > primaEdizione.NUM_MAX_STUDENTI) {
			System.out
					.println("Errore : numero massimo di studenti per questo corso :" + primaEdizione.NUM_MAX_STUDENTI);
			System.out.println("Inserisci un numero valido:");
			numero = in.nextInt();
		}

		Studente[] nuoviStud = new Studente[numero];
		Abilita[] a = new Abilita[numero];

		in.nextLine(); // Pulisce il buffer

		for (int i = 0; i < numero; i++) {

			System.out.println(
					"Inserisci in quest'ordine Nome,Cognome,Data di nascita,CodiceFiscale dello studente " + (i + 1));
			nuoviStud[i] = new Studente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
			System.out.println("Scrivi in quest'ordine le varie caratteristiche dello studente " + nuoviStud[i].nome);
			System.out.println(
					"1) Materia preferita " + "2)Argomento preferito " + "3)Livello abilità(basso/medio/alto)");
			a[i] = new Abilita(in.nextLine(), in.nextLine(), in.nextLine());
			primaEdizione.studentiIscritti[i] = nuoviStud[i];
			primaEdizione.contaStudenti++;

		}
		in.close();

		primaEdizione.report();

	}

}
