package it.epicode.EserciziSecondaSettimana;

public class CategoriaMerceologica {
	private String nome;
	private String codice;
	
	public CategoriaMerceologica(String nome,String codice) {
		this.nome = nome;
		this.codice = codice;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	public void setCodice() {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public String getCodice() {
		return codice;
	}
}
