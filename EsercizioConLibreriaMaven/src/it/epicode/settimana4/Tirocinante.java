package it.epicode.settimana4;

public class Tirocinante {
	private int id;
	private int matricola;
	private String nome;
	private String cognome;
	private String classe;
	private String idAzienda;
	private String idTutor;

	public Tirocinante(int id, int matricola, String nome, String cognome, String classe, String idAzienda,
			String idTutor) {
		this.id = id;
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.classe = classe;
		this.idAzienda = idAzienda;
		this.idTutor = idTutor;
	}

	public Tirocinante(int id, String nome, String cognome, String classe) {
		this.id = id;

		this.nome = nome;
		this.cognome = cognome;
		this.classe = classe;

	}

	@Override
	public String toString() {
		return id + " " + nome + " " + cognome + " " + classe;
	}
}
