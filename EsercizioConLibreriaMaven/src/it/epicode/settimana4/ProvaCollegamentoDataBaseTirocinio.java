package it.epicode.settimana4;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProvaCollegamentoDataBaseTirocinio {
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("Driver caricato");

	}

	public static void main(String[] args) throws SQLException{
		
		String connectionUrl = "jdbc:postgresql://localhost:5432/esercizio1(v2)?currentSchema=tirocinio&user=postgres&password=epicode";
		String selectTutor = "SELECT * FROM tutor";
		try (Connection connection = DriverManager.getConnection(connectionUrl);
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(selectTutor);) {

			
			System.out.println("Collegamento al database effettuato");

			System.out.println("Dati dei tutor:");
			while (result.next()) {
				System.out.println(
						result.getInt("id") + " " + result.getString("nome") + " " + result.getString("cognome"));
			}
		}
	
	}
	
}
