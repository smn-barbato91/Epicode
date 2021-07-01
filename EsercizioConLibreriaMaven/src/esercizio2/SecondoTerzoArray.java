package esercizio2;

public class SecondoTerzoArray implements Runnable {
	private int[] a;
	private int totale;
	private int first;
	private int last;

	public SecondoTerzoArray(int[] a) {
		this.a = a;
		getSecondoTerzo(a);
	}

	public int getTotale() {
		return this.totale;
	}

	private void getSecondoTerzo(int[] array) {
		first = array.length / 3;
		last = (array.length * 2) / 3;

	}

	@Override
	public void run() {

		for (int i = first; i < last; i++) {
			totale = totale + a[i];

		}
		System.out.println("La somma degli elementi del secondo terzo dell'array è: " + totale);
	}

}
