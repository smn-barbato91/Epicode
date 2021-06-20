package it.epicode.EserciziPrimaSettimana;

public class Abilita {
	
	public String nome; //Esempio matematica,italiano,storia ecc
	public String areaDiCompetenza;//Esempio equazioni,D'annunzio,Seconda guerra mondiale
	public String livello;//Basso/Medio/Alto
	
	
	public Abilita(String nome, String areaDiCompetenza, String livello) {
		this.nome = nome;
		this.areaDiCompetenza = areaDiCompetenza;
		this.livello = livello;
	}
	public Abilita() {
		
	}

}
