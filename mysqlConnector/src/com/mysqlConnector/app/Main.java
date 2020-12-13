package com.mysqlConnector.app;

import java.util.Scanner;

import com.mysqlConnector.controller.PersonController;

public class Main {

	public static void main(String[] args) {
		
		try {
			PersonController app = new PersonController();
			System.out.println(" ");
			System.out.println("==================== Menu ====================");
			System.out.println(" 1-Create new Data");
			System.out.println(" 2-Read Data");
			System.out.println(" 3-Update Data");
			System.out.println(" 4-Delete Data");
			System.out.println("========================================");
			do {
			
				switch (new Scanner(System.in).nextInt()) {
				
					case 1:
						System.out.println("__________ New Data __________");
						System.out.println("");
						System.out.println("Entre Name ");
						String name = new Scanner(System.in).nextLine();
						
						System.out.println("Entre Description");
						String description = new Scanner(System.in).nextLine();
						
						System.out.println("CIN");
						String CIN = new Scanner(System.in).nextLine();
						
						app.InsertData(name,description, CIN);
						break;
						
					case 2:
						System.out.println("*************************************");
						System.out.println("__________ All Data __________");
						app.ReadData();
						System.out.println("*************************************");
						break;
						
					case 3:
						System.out.println("__________ Update __________");
						break;
						
					case 4:
						System.out.println("__________ Delete __________");
						System.out.println("Choose Identif : ");
						Long d_id = new Scanner(System.in).nextLong();
						app.DeleteData(d_id);
						break;
					default:
						break;
				}
				
			} while (true);
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
