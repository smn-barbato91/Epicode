package esercizio3;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Presenza {
	String nome;
	int giorniDiPresenza;

	public Presenza(String nome, int giorniDiPresenza) {
		this.nome = nome;
		this.giorniDiPresenza = giorniDiPresenza;
	}

	public String getNome() {
		return nome;
	}

	public int getGiorniDiPresenza() {
		return giorniDiPresenza;
	}
	@Override
	public String toString() {
		return nome + "#" + giorniDiPresenza;
	}
	public static Presenza fromString(String s) {
		String[] elements = s.split("#");
		Presenza p = new Presenza(elements[0], Integer.valueOf(elements[1]));
		return p;
	}

}
