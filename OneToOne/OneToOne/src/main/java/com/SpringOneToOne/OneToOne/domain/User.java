package com.SpringOneToOne.OneToOne.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[user]")
public class User {
	@Id
	@GeneratedValue
	private Long id; 
	private String name, age, bornCity, career;	
	
	@OneToOne
	@JoinColumn(name = "login_id")
	private Login login;
	
	public User(String name, String age, String bornCity, String career) {
		this.name = name;
		this.age = age;
		this.bornCity = bornCity;
		this.career = career; 
	}

	public Long getId() {
		return id;
	}

	
}
