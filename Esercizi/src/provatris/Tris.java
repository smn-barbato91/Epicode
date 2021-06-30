package provatris;

import java.util.Scanner;

public class Tris {

	private static final int RIGHE = 3;
	private static final int COLONNE = 3;
	private int contaTurni = 0;
	private String[][] griglia = new String[RIGHE][COLONNE];
	Scanner tastiera = new Scanner(System.in);

	public void gioca() {
		System.out.println("Giocatore 1 = X");
		System.out.println("Giocatore 2 = O");
		System.out.println();
		creaGriglia();
		int conta = 0;
		do {
			inserisciSimboli();
			controllaFineGioco();
		} while (conta < 4);

	}

	private void creaGriglia() {

		griglia[0][0] = "[-]";
		griglia[0][1] = "[-]";
		griglia[0][2] = "[-]";
		griglia[1][0] = "[-]";
		griglia[1][1] = "[-]";
		griglia[1][2] = "[-]";
		griglia[2][0] = "[-]";
		griglia[2][1] = "[-]";
		griglia[2][2] = "[-]";

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(griglia[i][j]);
			}
			System.out.println();
		}

	}

	private boolean inserisciX() {
		boolean inserito = true;

		do {
			System.out.println("In quale posizione vuoi mettere la X?(specifica riga e colonna)");
			int riga = tastiera.nextInt();
			int colonna = tastiera.nextInt();
			tastiera.nextLine();

			String c = griglia[riga - 1][colonna - 1];

			if (c.equals("[-]")) {

				c = "[X]";
				griglia[riga - 1][colonna - 1] = c;

				inserito = true;

			} else if (!c.equals("[-]")) {

				System.out.println("Posizione già occupata. Riprova");

				inserito = false;

			}
		} while (inserito == false);
		return inserito;
	}

	private void inserisciSimboli() {

		inserisciX();
		getVincitore();
		inserisciO();

		System.out.println(getVincitore());

		if (getVincitore().equalsIgnoreCase("Vince il giocatore X")
				|| getVincitore().equalsIgnoreCase("Vince il giocatore O")) {
			aggiornaGriglia();
			System.exit(0);
		}

		aggiornaGriglia();

	}

	private boolean inserisciO() {

		boolean inserito = true;

		do {
			System.out.println("L'avversario sta inserendo il cerchio...");
			int riga = (int) (Math.random() * 3 + 1);
			int colonna = (int) (Math.random() * 3 + 1);

			String c = griglia[riga - 1][colonna - 1];

			if (c.equals("[-]")) {

				c = "[O]";
				griglia[riga - 1][colonna - 1] = c;

				inserito = true;

			} else if (!c.equals("[-]")) {

				System.out.println("Posizione già occupata. L'avversario sta riprovando...");

				inserito = false;

			}
		} while (inserito == false);

		return inserito;

	}

	private void aggiornaGriglia() {

		for (int i = 0; i < RIGHE; i++) {
			for (int j = 0; j < COLONNE; j++) {
				System.out.print(griglia[i][j]);

			}
			System.out.println();

		}

	}

	private int controllaFineGioco() {

		contaTurni++;

		if (contaTurni == 4 && (getVincitore() == "X" || getVincitore() == "O")) {
			
			System.out.println("Vince il giocatore " + getVincitore());
		} else if (contaTurni == 4){
			System.out.println("PAREGGIO");
			System.exit(0);
		}
		

		return contaTurni;

	}

	private String getVincitore() {

		// Verifico se il tris è presente in una riga

		for (int i = 0; i < RIGHE; i++) {
			int k = 0;
			int h = 0;

			for (int j = 0; j < COLONNE; j++) {
				if (griglia[i][j].equals("[X]"))
					k++;

				if (k == 3)
					return "Vince il giocatore X";

				if (griglia[i][j].equals("[O]"))

					h++;

				if (h == 3)

					return "Vince il giocatore O";

			}

		}
		// Verifico se il tris è presente in una colonna
		for (int i = 0; i < COLONNE; i++) {
			int k = 0;
			int h = 0;

			for (int j = 0; j < RIGHE; j++) {
				if (griglia[j][i].equals("[X]"))
					k++;

				if (k == 3)
					return "Vince il giocatore X";

				if (griglia[j][i].equals("[O]"))

					h++;

				if (h == 3)

					return "Vince il giocatore O";

			}
		}
		// verifico se il tris è presente nella diagonale dx
		int k = 0;
		int h = 0;
		for (int i = 0; i < RIGHE; i++) {

			int j = i;

			if (griglia[i][j].equals("[X]"))
				k++;

			if (k == 3)
				return "Vince il giocatore X";

			if (griglia[i][j].equals("[O]"))

				h++;

			if (h == 3)

				return "Vince il giocatore O";

		}

		k = 0;
		h = 0;
		// verifico se il tris è presente nella diagonale sx
		for (int j = COLONNE - 1, i = 0; j >= 0; j--) {

			if (griglia[i][j].equals("[X]"))
				k++;

			if (k == 3)
				return "Vince il giocatore X";

			if (griglia[i][j].equals("[O]"))

				h++;

			if (h == 3)

				return "Vince il giocatore O";
			i++;

		}

		return "";
	}
}
