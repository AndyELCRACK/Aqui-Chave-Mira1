package com.biblioteca.conexon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostGresDB {
	private static Connection cnn;
	private static String url = "jdbc:postgresql://localhost:5432/Biblioteca";
	private static String user="postgres";
	private static String password = "1234";
	
	public static Connection Open() throws SQLException{
		cnn=DriverManager.getConnection(url, user, password);
		return cnn;
	}
	
	public static void close() throws SQLException{
		cnn.close();
	}

}
