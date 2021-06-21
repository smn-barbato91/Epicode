package it.epicode.EserciziPrimaSettimana;

public class Abilita {

	public String nome; // Esempio matematica,italiano,storia ecc
	public String areaDiCompetenza;// Esempio equazioni,D'annunzio,Seconda guerra mondiale
	public Livello livello;

	public Abilita(String nome, String areaDiCompetenza, Livello livello) {
		this.nome = nome;
		this.areaDiCompetenza = areaDiCompetenza;
		this.livello = livello;
	}

}
