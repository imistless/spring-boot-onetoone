package com.SpringOneToOne.OneToOne.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Table(name = "login")
public class Login {
	@Id
	@GeneratedValue
	private Long id; 
	private String login, password; 
	
	@OneToOne(mappedBy = "login")
	private User user;

	public Login(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public Long getId() {
		return id;
	} 
	
}
