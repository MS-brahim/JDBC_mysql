package com.mysqlConnector.config;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Database {

	final String DRIVER = "com.mysql.jdbc.Driver";
	final String DB_PATH = "jdbc:mysql://localhost:3306/test";
	String userName = "root";
	String password = "";
	public Connection conn;
	Statement stmt;
		
	//Constructor
	public Database() {

	}

	public void connect() throws SQLException, Exception{
		Class.forName(DRIVER);
		System.out.println("Connection success...");
		conn = DriverManager.getConnection(DB_PATH,userName,password);
		stmt = conn.createStatement();
	}
		
	public Statement getStatement() {
		return stmt;
	}
	
	public Connection getConnection() {
		return conn;
	}
}
