package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private final String name;
	private final String emailId;

	public User(long id, String name, String emailId) {
		super();
		Id = id;
		this.name = name;
		this.emailId = emailId;
	}
	public User() {
        this.name = "";
        this.emailId = "";
    }
	public User(String name, String emailId) {
		super();
		this.name = name;
		this.emailId = emailId;
	}
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public String getEmailId() {
		return emailId;
	}

}
