package esercizio2;

public class UltimoTerzoArray implements Runnable {

	private int[] a;
	private int totale;
	private int first;
	private int last;

	public UltimoTerzoArray(int[] a) {
		this.a = a;
		getUltimoTerzo(a);
	}

	public int getTotale() {
		return this.totale;
	}

	private void getUltimoTerzo(int[] array) {

		first = (array.length * 2) / 3;
		last = array.length;

	}

	@Override
	public void run() {

		for (int i = first; i < last; i++) {
			totale = totale + a[i];

		}
		System.out.println("La somma degli elementi dell'ultimo terzo dell'array è: " + totale);

	}

}
