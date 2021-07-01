package esercizio2;

public class PrimoTerzoArray implements Runnable {
	private int[] a;
	private int first;
	private int last;
	private int totale;

	public PrimoTerzoArray(int[] a) {
		this.a = a;
		getPrimoTerzo(a);
	}

	public int getTotale() {
		return this.totale;
	}

	public void getPrimoTerzo(int[] array) {

		last = array.length / 3;

	}

	@Override
	public void run() {

		for (int i = first; i < last; i++) {
			totale = totale + a[i];

		}
		System.out.println("La somma degli elementi del primo terzo dell'array è: " + totale);
	}
}
