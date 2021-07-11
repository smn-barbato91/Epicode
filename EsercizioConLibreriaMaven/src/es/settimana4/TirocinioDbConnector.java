package es.settimana4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TirocinioDbConnector {

	private ConnectionHandler connectionHandler;

	public TirocinioDbConnector() throws ClassNotFoundException {
		connectionHandler = new ConnectionHandler("jdbc:postgresql://localhost:5432//esercizio1(v2)", "tirocinio", "postgres",
				"epicode");
	}

//	public TirocinioDbConnector() throws ClassNotFoundException {
//		connectionHandler = new ConnectionHandler("jdbc:postgresql://localhost:5432/esercizio1(v2)?currentSchema=tirocinio&user=postgres&password=epicode");
//
//	
//
//}

	public static void main(String[] args) {
		try {
			TirocinioDbConnector db = new TirocinioDbConnector();

			stampaTirocinanti(db);

			stampaTutor(db);

			db.insertTirocinante(999l, "11233", "Linus", "Torvalds", "1C", 1l, 1l);

			db.updateTirocinante(999l, "11233", "Marcus", "Torvalds", "1C", 1l, 1l);

			db.deleteTirocinante(999l);

			stampaTirocinantiMicrosoft(db);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void stampaTirocinanti(TirocinioDbConnector db) {
		System.out.println("----------- Tirocinanti ------------");

		List<Object[]> listaTirocinanti = db.cercaTirocinanti();

		printListTirocinanti(listaTirocinanti);
	}

	private static void stampaTirocinantiMicrosoft(TirocinioDbConnector db) {
		System.out.println("----------- Tirocinanti Microsoft ------------");
		List<Object[]> listaTirocinanti = db.cercaTirocinantiPerAzienda("Microsoft");

		printListTirocinanti(listaTirocinanti);
	}

	private static void stampaTutor(TirocinioDbConnector db) {
		System.out.println("----------- Tutor ------------");

		List<Object[]> listaTutor = db.cercaTutor();

		for (Object[] curTut : listaTutor) {
			System.out.println("------------------------------------------");

			System.out.println("Nome: " + String.valueOf(curTut[1]));

			System.out.println("Cognome: " + String.valueOf(curTut[2]));

			System.out.println("Materia: " + String.valueOf(curTut[3]));
		}
	}

	private static void printListTirocinanti(List<Object[]> listaTirocinanti) {
		for (Object[] curTir : listaTirocinanti) {
			System.out.println("------------------------------------------");

			System.out.println("Id: " + String.valueOf(curTir[0]));

			System.out.println("Nome: " + String.valueOf(curTir[1]));

			System.out.println("Cognome: " + String.valueOf(curTir[2]));

			System.out.println("Classe: " + String.valueOf(curTir[3]));
		}
	}

	private List<Object[]> cercaTirocinanti() {
		List<Object[]> result = new ArrayList<Object[]>();

		try {
			Connection con = connectionHandler.getConnection();
			try {
				PreparedStatement preparedStatement = connectionHandler
						.getPreparedStatement("select id, nome, cognome, classe from tirocinante");

				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					Object[] tirocinante = new Object[5];
					tirocinante[0] = resultSet.getLong("id");
					tirocinante[1] = resultSet.getString("nome");
					tirocinante[2] = resultSet.getString("cognome");
					tirocinante[3] = resultSet.getString("classe");

					result.add(tirocinante);
				}

			} finally {
				connectionHandler.closeConnection();
			}
		} catch (SQLException e) {
			System.out.println("Errore durante il caricamento dei tirocinanti");
		}
		return result;
	}

	private List<Object[]> cercaTutor() {
		List<Object[]> result = new ArrayList<Object[]>();

		try {
			Connection con = connectionHandler.getConnection();
			try {
				PreparedStatement preparedStatement = connectionHandler
						.getPreparedStatement("select id, nome, cognome, materia from tutor");

				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					Object[] tutor = new Object[4];
					tutor[0] = resultSet.getLong("id");
					tutor[1] = resultSet.getString("nome");
					tutor[2] = resultSet.getString("cognome");
					tutor[3] = resultSet.getString("materia");

					result.add(tutor);
				}

			} finally {
				connectionHandler.closeConnection();
			}
		} catch (SQLException e) {
			System.out.println("Errore durante il caricamento dei tutor");
		}
		return result;
	}

	private void insertTirocinante(Long id, String matricola, String nome, String cognome, String classe,
			Long idazienda, Long idtutor) {

		try {
			Connection con = connectionHandler.getConnection();
			try {

				String insertSql = "INSERT INTO tirocinante (id_tirocinante, matricola, nome, cognome, classe, idazienda, idtutor) "
						+ "VALUES (?, ?, ?, ?, ?, ?,?)";
				PreparedStatement preparedStatement = connectionHandler.getPreparedStatement(insertSql);

				preparedStatement.setLong(1, id);
				preparedStatement.setString(2, matricola);
				preparedStatement.setString(3, nome);
				preparedStatement.setString(4, cognome);
				preparedStatement.setString(5, classe);
				preparedStatement.setLong(6, idazienda);
				preparedStatement.setLong(7, idtutor);

				preparedStatement.executeUpdate();

			} finally {
				connectionHandler.closeConnection();
			}
		} catch (SQLException e) {
			System.out.println("Errore durante l'inserimento del Tirocinante");
		}
	}

	private void updateTirocinante(Long id, String matricola, String nome, String cognome, String classe,
			Long idazienda, Long idtutor) {

		try {
			Connection con = connectionHandler.getConnection();
			try {

				String updateSql = "UPDATE tirocinante SET matricola = ?, " + "nome = ?, " + "cognome = ?, "
						+ "classe = ?, " + "idazienda = ?, " + "idtutor = ? " + "WHERE id_tirocinante = ?";

				PreparedStatement preparedStatement = connectionHandler.getPreparedStatement(updateSql);

				preparedStatement.setString(1, matricola);
				preparedStatement.setString(2, nome);
				preparedStatement.setString(3, cognome);
				preparedStatement.setString(4, classe);
				preparedStatement.setLong(5, idazienda);
				preparedStatement.setLong(6, idtutor);
				preparedStatement.setLong(7, id);

				preparedStatement.executeUpdate();

			} finally {
				connectionHandler.closeConnection();
			}
		} catch (SQLException e) {
			System.out.println("Errore durante l'update del Tirocinante");
		}
	}

	private void deleteTirocinante(long id) {

		try {
			Connection con = connectionHandler.getConnection();
			try {

				String deleteSql = "DELETE FROM tirocinante" + " WHERE id_tirocinante = ?";

				PreparedStatement preparedStatement = connectionHandler.getPreparedStatement(deleteSql);

				preparedStatement.setLong(1, id);

				preparedStatement.executeUpdate();

			} finally {
				connectionHandler.closeConnection();
			}
		} catch (SQLException e) {
			System.out.println("Errore durante l'eliminazione del Tirocinante");
		}
	}

	private List<Object[]> cercaTirocinantiPerAzienda(String nomeAzienda) {
		List<Object[]> result = new ArrayList<Object[]>();

		try {
			Connection con = connectionHandler.getConnection();
			try {
				String query = "select tir.id, tir.nome, tir.cognome, tir.classe from tirocinante tir "
						+ "inner join azienda az on tir.idazienda = az.id " + "where az.nome = ? ";
				PreparedStatement preparedStatement = connectionHandler.getPreparedStatement(query);

				preparedStatement.setString(1, nomeAzienda);

				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					Object[] tirocinante = new Object[5];
					tirocinante[0] = resultSet.getLong("id");
					tirocinante[1] = resultSet.getString("nome");
					tirocinante[2] = resultSet.getString("cognome");
					tirocinante[3] = resultSet.getString("classe");

					result.add(tirocinante);
				}

			} finally {
				connectionHandler.closeConnection();
			}
		} catch (SQLException e) {
			System.out.println("Errore durante il caricamento dei tirocinanti per azienda");
		}
		return result;
	}

}
