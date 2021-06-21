package it.epicode.EserciziPrimaSettimana;

public class Studente {

	public String nome;
	public String cognome;
	public String dataDiNascita;
	public String codiceFiscale;
	public Abilita[] listaAbilita = new Abilita[Edizione.NUM_MAX_STUDENTI];

	public Studente(String nome, String cognome, String dataDiNascita, String codiceFiscale) {

		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.codiceFiscale = codiceFiscale;

	}

//
//	public void scriviAbilita(Abilita a, int posizione) {
//		Scanner tastiera = new Scanner(System.in);
//		
//		System.out.println("Scrivi la materia in cui è più abile lo studente " + nome + " " + cognome + " : ");
//		a.nome = tastiera.nextLine();
//		System.out.println("Scrivi l'argomento sul quale " + nome + " è più preparato: ");
//		a.areaDiCompetenza = tastiera.nextLine();
//		System.out.println("Scrivi il livello di competenza dello studente " + nome + "(basso,medio,alto): ");
//		a.livello = tastiera.nextLine();
//		listaAbilita[posizione] = a;
//		

//	}

}
