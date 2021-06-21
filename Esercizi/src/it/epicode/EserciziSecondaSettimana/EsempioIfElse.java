package it.epicode.EserciziSecondaSettimana;

public class EsempioIfElse {

	public static boolean stringaPariDispari(String s) {
		boolean pari = false;

		if ((s.length()) % 2 == 0) {
			pari = true;
		}

		return pari;
	}
	
	public static boolean annoBisestile(int anno) {
		boolean bisestile = false;
		if((anno % 100) == 0 && (anno % 400) == 0) {
			bisestile = true;
		} else if((anno % 4) == 0) {
			bisestile = true;
		}
		return bisestile;
	}

	public static void main(String[] args) {
		String s = "Ciao mondo";
		int anno = 2020;
		System.out.println(stringaPariDispari(s));
		System.out.println(annoBisestile(anno));
	}

}
