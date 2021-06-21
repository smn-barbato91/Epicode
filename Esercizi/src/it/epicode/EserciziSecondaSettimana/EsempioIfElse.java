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
		if (anno % 4 == 0 && anno % 100 == 0 && anno % 400 == 0) {
			return true;
		} else if (anno % 4 == 0 && anno % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "Ciao mondo";
		int anno = 200;
		System.out.println(stringaPariDispari(s));
		System.out.println(annoBisestile(anno));
	}

}
