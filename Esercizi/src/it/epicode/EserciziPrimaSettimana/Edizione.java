package it.epicode.EserciziPrimaSettimana;

public class Edizione {

	public Corso corso = new Corso();
	public String codice; // Esempio BE0321 per il corso back end
	public String dataDiPartenza;
	public String dataDiChiusura;
	public static int NUM_MAX_STUDENTI = 10;
	public Studente[] studentiIscritti = new Studente[NUM_MAX_STUDENTI];
	public Docente doc = new Docente();
	public int contaStudenti;

	public Edizione(Corso corso, String codice, String dataDiPartenza, String dataDiChiusura, Docente doc) {

		this.corso = corso;
		this.codice = codice;
		this.dataDiPartenza = dataDiPartenza;
		this.dataDiChiusura = dataDiChiusura;
		this.doc = doc;

	}

	public void report() {

		System.out.println("RIEPILOGO CORSO" + "\n");
		System.out.println("Nome corso :" + corso.titolo + " ," + corso.durata + " ore, Livello difficoltà: "
				+ corso.livelloDiDifficoltà + " , Costo: " + corso.costo + "£");
		System.out.println("Codice corso: " + codice);
		System.out.println("Data di partenza: " + dataDiPartenza);
		System.out.println("Data di chiusura: " + dataDiChiusura);
		System.out.println("Docente: " + doc.nome + " " + doc.cognome);
		System.out.println("Numero di studenti iscritti: " + contaStudenti + "\n");
		System.out.println("ELENCO STUDENTI");

		for (int i = 0; i < contaStudenti; i++) {

			System.out.println(studentiIscritti[i].nome + " " + studentiIscritti[i].cognome);

		}

	}

}
