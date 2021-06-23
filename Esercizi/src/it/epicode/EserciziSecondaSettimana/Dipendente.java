package it.epicode.EserciziSecondaSettimana;

public class Dipendente {
	public static double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	Livello livello;
	Dipartimento dipartimento;

	public Dipendente(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = livello.OPERAIO;
	}

	public Dipendente(String matricola, Livello livello, Dipartimento dipartimento) {

		this.matricola = matricola;
		this.importoOrarioStraordinario = 30;
		

		if (livello.equals(livello.OPERAIO)) 
			this.stipendio = stipendioBase;
		
		if (livello.equals(livello.IMPIEGATO)) 
			this.stipendio = stipendioBase * 1.2;
		
		if (livello.equals(livello.QUADRO)) 
			this.stipendio = stipendioBase * 1.5;
		
		if (livello.equals(livello.DIRIGENTE)) 
			this.stipendio = stipendioBase * 2;
		

		this.livello = livello;

		this.dipartimento = dipartimento;

	}

	public static double getStipendioBase() {
		return stipendioBase;
	}

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public Livello getLivello() {
		return livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public void stampaDipendente() {
		System.out.println("######################");
		System.out.println("Matricola: " + getMatricola());
		System.out.println("Stipendio mensile: " + getStipendio());
		System.out.println("Livello: " + getLivello());
		System.out.println("Dipartimento: " + getDipartimento());

	}

	public Livello promuovi() {

		switch (this.livello) {
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			break;
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			break;
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
		case DIRIGENTE:
			this.livello = Livello.DIRIGENTE;
			break;
		default:
			System.exit(0);
		}
		aggiornaStipendio();

		return livello;
	}

	private double aggiornaStipendio() {

		if (livello.equals(Livello.OPERAIO)) {
			this.stipendio = stipendioBase;
		}
		if (livello.equals(Livello.IMPIEGATO)) {
			this.stipendio = stipendioBase * 1.2;
		}
		if (livello.equals(Livello.QUADRO)) {
			this.stipendio = stipendioBase * 1.5;
		}
		if (livello.equals(Livello.DIRIGENTE)) {
			this.stipendio = stipendioBase * 2;
		}
		return stipendio;
	}

}
