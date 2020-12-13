package com.mysqlConnector.model;

public class Person {

	private long id;
	private String name;
	private String description;
	private String CIN;
	
	public Person(long id, String name, String description, String CIN) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.CIN = CIN;
	}

	public Person() {
	super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String CIN) {
		this.CIN = CIN;
	}
	
}
