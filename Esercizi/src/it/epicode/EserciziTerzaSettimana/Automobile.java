package it.epicode.EserciziTerzaSettimana;

public class Automobile {

	public Automobile() {

	}

	public double chilometriALitro(double chilometriPercorsi, double litriCarburante) throws DivisionePerZeroException {
		if (litriCarburante == 0)
			throw new DivisionePerZeroException();
		return chilometriPercorsi / litriCarburante;
	}

	public int dividi(int km, int litri) {
		return km / litri;
	}

}
