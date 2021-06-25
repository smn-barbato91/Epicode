package it.epicode.EserciziSecondaSettimana;

public class NonAlimentare extends Prodotto {
	CategoriaMerceologica categoria;

	public NonAlimentare(String descrizione,double prezzoUnitario,CategoriaMerceologica categoria) {
		super(descrizione,prezzoUnitario);
		this.categoria = categoria;
	}
	
	public void infoProdotto() {
		
		System.out.println("Descrizione prodotto: " + getDescrizione());
		System.out.println("Prezzo unitario: " + getPrezzoUnitario());
		System.out.println("Nome: " +categoria.getNome() + " " + "Codice: " +categoria.getCodice());
		
		
		
	}
}
