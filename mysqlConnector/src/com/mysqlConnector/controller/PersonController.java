package com.mysqlConnector.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import com.mysqlConnector.config.Database;

public class PersonController {
	
	Database DB = new Database();

	public PersonController() {
		
		try {
			DB.connect();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void ReadData() throws SQLException {
		
		String sql = "SELECT * FROM youcode_test";
		ResultSet result = DB.getStatement().executeQuery(sql);
		while(result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			String description = result.getString("description");
			String CIN = result.getString("CIN");
		
			System.out.println(id +" "+ name +" "+ description +" "+ CIN);
		}
	}
	
	public void InsertData(String name, String description, String CIN) throws SQLException {
		
		String sql = "INSERT INTO youcode_test(name, description, CIN)"
				+ "VALUES (?,?,?)";
		PreparedStatement  statement = DB.getConnection().prepareStatement(sql);
		statement.setString(1, name);
		statement.setString(2, description);
		statement.setString(3, CIN);

		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("");
		    System.out.println("New data was inserted successfully!");
		}
	}
	
	public void UpdateData(long id, String name, String description, String CIN) {
		
	}
	
	public void DeleteData(long id) throws SQLException {
		
		String sql = "DELETE FROM youcode_test WHERE id=?";
		PreparedStatement statement = DB.getConnection().prepareStatement(sql);
		statement.setInt(1, (int) id);
		 
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
		    System.out.println("Data was deleted successfully!");
		}
	}
}
