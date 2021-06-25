package it.epicode.EserciziSecondaSettimana;
import java.time.LocalDate;
public class StartProdotto {
	public static void main(String[] args) {
		CategoriaMerceologica cat = new CategoriaMerceologica("Trattore","12345");
		
		NonAlimentare prodottoNonAlimentare = new NonAlimentare("Lamborghini,diesel,euro6", 15000,cat);
		
		Alimentare prodottoAlimentare = new Alimentare(14234,"Pasta Barilla",1.55,LocalDate.now(),false);
		
		
		prodottoAlimentare.applicaSconto();
		prodottoAlimentare.infoProdotto();
		prodottoNonAlimentare.applicaSconto();
		prodottoNonAlimentare.infoProdotto();
		
		
	}

}
