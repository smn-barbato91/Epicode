package it.epicode.EserciziTerzaSettimana;

public class Start {

	public static void main(String[] args) {
		
//		try {                                                  In questo blocco ho trattato l'eccezione come checked
//			Automobile auto = new Automobile();				   Ho quindi creato una classe DivisionePerZeroException estendendola
//			System.out.println(auto.chilometriALitro(100, 0)); da Exception.
//															   Notare che il metodo chilometriALitro() ha il throws perchè lancia l'eccezione
//		} catch(DivisionePerZeroException e) {				   che poi andrò a gestire nel main alla riga 11.
//			 System.out.println(e.getMessage());
//		}
		
		Automobile auto = new Automobile();
		try {											//In questo blocco invece ho gestito direttamente l'eccezione come unchecked perchè so 
			System.out.println(auto.dividi(10, 0));		//che ogni divisione per zero genererà un'eccezione di tipo ArithmeticException, quindi non 
		} catch(ArithmeticException e) {				//non mi resta che gestirla nel catch a riga 18
			System.out.println(e.getMessage());			//Stavolta il metodo dividi() non lancia (throws) nessuna eccezione.
		}
		
		

	}

}
