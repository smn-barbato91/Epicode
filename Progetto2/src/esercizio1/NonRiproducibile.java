package esercizio1;

public abstract class NonRiproducibile extends ElementoMultimediale{
	int luminosita;
	
	public NonRiproducibile(String titolo,int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}
	
	public void show() {
		
		String lum = "";
		for (int i = 0; i < luminosita; i++) {
			lum = lum + "*";
		}
		System.out.println(getTitolo() + lum);
	}
}
