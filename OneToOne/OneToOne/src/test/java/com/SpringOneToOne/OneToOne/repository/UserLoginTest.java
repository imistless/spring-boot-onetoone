package com.SpringOneToOne.OneToOne.repository;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringOneToOne.OneToOne.domain.Login;
import com.SpringOneToOne.OneToOne.domain.User;

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserLoginTest {
	@Autowired private UserRepository userRepository; 
	@Autowired private LoginRepository loginRepository; 
	private User user; 
	private Login login; 
	
	@Before
	public void setup() {
		 user = new User("Robert Downey Junior", "54 years old", "Nova York", "Actor");		
		 login = new Login("RobJr", "iamironman");
	}
		
	@Test
	public void saveUser() {
		userRepository.save(user);
		User userFound = userRepository.getOne(user.getId()); 
		assertEquals(userFound, user);		
	}

	@Test
	public void saveLogin() {
		loginRepository.save(login);
		Login loginFound = loginRepository.getOne(login.getId()); 
		assertEquals(loginFound, login);

	}
}
