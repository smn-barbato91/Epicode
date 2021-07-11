package it.epicode.settimana4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TirocinioDbConnector {

	public static final String TUTOR_BY_MATERIA = "SELECT*FROM tutor WHERE materia LIKE ?";
	private ConnectionHandler c;
	
	public TirocinioDbConnector(ConnectionHandler c) {
		this.c = c;
	}
	public TirocinioDbConnector() {
		
	}
	
	

	public List<Tirocinante> cercaTirocinanti() throws SQLException {

		List<Tirocinante> datiTirocinanti = new ArrayList<Tirocinante>();

		ConnectionHandler c = new ConnectionHandler("jdbc:postgresql://localhost:5432/esercizio1(v2)?",
				"currentSchema=tirocinio", "&user=postgres", "&password=epicode");

		String selectTirocinante = "SELECT * FROM tirocinante";

		try (Connection connection = DriverManager
				.getConnection(c.getDbUrl() + c.getSchema() + c.getUsername() + c.getPassword());
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(selectTirocinante);) {

			System.out.println("Collegamento al database effettuato");

			System.out.println("Dati dei tirocinanti:");
			while (result.next()) {

				datiTirocinanti.add(new Tirocinante(result.getInt("id_tirocinante"), result.getString("nome"),
						result.getString("cognome"), result.getString("classe")));
			}
			return datiTirocinanti;
		}
	}

	public List<Tutor> cercaTutor(String mat) throws SQLException {

		List<Tutor> datiTutor = new ArrayList<Tutor>();

		try (Connection con = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/esercizio1(v2)?currentSchema=tirocinio&user=postgres&password=epicode");
				PreparedStatement st = con.prepareStatement(TUTOR_BY_MATERIA);) {

			st.setString(1,  mat +"%");

			try (ResultSet rs = st.executeQuery()) {

				while (rs.next()) {
					datiTutor.add(new Tutor(rs.getInt("id"), rs.getString("nome"), rs.getString("cognome"),
							rs.getString("materia")));

				}

				return datiTutor;
			}

		}

	}

	public void insertTirocinante(int id, int matricola, String nome, String cognome, String classe, int idazienda,
			int idtutor) throws SQLException {
		ConnectionHandler c = new ConnectionHandler("jdbc:postgresql://localhost:5432/esercizio1(v2)?",
				"currentSchema=tirocinio", "&user=postgres", "&password=epicode");

		String inserisci = "INSERT INTO tirocinio.tirocinante (id_tirocinante, matricola, nome, cognome, classe, id_azienda, id_tutor)"
				+ " VALUES (?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager
				.getConnection(c.getDbUrl() + c.getSchema() + c.getUsername() + c.getPassword());
				PreparedStatement st = connection.prepareStatement(inserisci);) {

			st.setInt(1, id);
			st.setInt(2, matricola);
			st.setString(3, nome);
			st.setString(4, cognome);
			st.setString(5, classe);
			st.setInt(6, idazienda);
			st.setInt(7, idtutor);

			st.executeUpdate();

		}

	}

	public void cancellaTirocinante(int id) throws SQLException {
		ConnectionHandler c = new ConnectionHandler("jdbc:postgresql://localhost:5432/esercizio1(v2)?",
				"currentSchema=tirocinio", "&user=postgres", "&password=epicode");

		String rimuovi = "DELETE FROM tirocinio.tirocinante as t WHERE t.id_tirocinante = ? ";

		try (Connection connection = DriverManager
				.getConnection(c.getDbUrl() + c.getSchema() + c.getUsername() + c.getPassword());
				PreparedStatement st = connection.prepareStatement(rimuovi);) {

			st.setInt(1, id);

			st.executeUpdate();

			

		}
	}
}
