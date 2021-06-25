package it.epicode.EserciziSecondaSettimana;

public abstract class Prodotto {
	private int codice;
	private String descrizione;
	private double prezzoUnitario;
	
	public Prodotto(int codice,String descrizione,double prezzoUnitario) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzoUnitario = prezzoUnitario;
	}
	public Prodotto(String descrizione,double prezzoUnitario) {
		this.descrizione = descrizione;
		this.prezzoUnitario = prezzoUnitario;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public void applicaSconto() {
		prezzoUnitario = prezzoUnitario - (prezzoUnitario * 0.05);
	}
	
	public String datiProdotto() {
		return codice + " " +descrizione + " " + prezzoUnitario;
	}
	

}
