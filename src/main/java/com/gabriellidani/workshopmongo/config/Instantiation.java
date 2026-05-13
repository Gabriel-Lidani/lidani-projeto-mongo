package com.gabriellidani.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.gabriellidani.workshopmongo.domain.User;
import com.gabriellidani.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User gabriel = new User(null, "Gabriel Lidani", "gabriel@gmail.com");
		User nicoly = new User(null, "Nicoly Lidani", "nicoly@gmail.com");
		User mayla = new User(null, "Mayla Lidani", "mayla@gmail.com");
		
		userRepository.saveAll(Arrays.asList(gabriel, nicoly, mayla));
	}
}
