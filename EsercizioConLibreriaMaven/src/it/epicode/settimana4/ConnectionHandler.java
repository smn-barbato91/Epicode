package it.epicode.settimana4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHandler {

	static {
		try {
			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}
	private Connection connection;
	private String dbUrl;
	private String schema;
	private String username;
	private String password;

	public ConnectionHandler(String dbUrl, String schema, String username, String password) {
		this.dbUrl = dbUrl;
		this.schema = schema;
		this.username = username;
		this.password = password;
	}

	public Connection getConnection() throws SQLException {

		connection = DriverManager.getConnection(dbUrl + schema + username + password);

		return connection;

	}

	public void closeConnection(Connection c) {
		try {
			c.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public PreparedStatement getPreparedStatement(String query) throws SQLException {

		//connection = getConnection();
		
		 PreparedStatement s = connection.prepareStatement(query);

		return s;

	}

	public String getDbUrl() {
		return dbUrl;
	}

	public String getSchema() {
		return schema;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
