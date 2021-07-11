package it.epicode.settimana4;

public class Tutor {
	private int id;
	private String nome;
	private String cognome;
	private String materia;

	public Tutor(int id, String nome, String cognome,String materia) {

		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.materia = materia;
	}
	
	@Override
	public String toString() {
		return id + " " + nome + " " + cognome + " " + materia;
	}

}
