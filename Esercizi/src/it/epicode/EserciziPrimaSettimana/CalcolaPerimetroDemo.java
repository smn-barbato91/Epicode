package it.epicode.EserciziPrimaSettimana;

public class CalcolaPerimetroDemo {

	public static void main(String[] args) {
		
		double altezza = 2.55;
		double larghezza = 4.344782;
		int n = 13;
		
		System.out.println(calcolaPerimetroRettangolo(larghezza, larghezza));
		System.out.println(isEven(n));
		
		

	}
	
	public static double calcolaPerimetroRettangolo(double h, double l) {
		
		return 2 * (h+l);
	}
	
	public static boolean isEven(int x) {
		
		if((x % 2) == 0) {
			return true;
		}
		return false;
	}

}
