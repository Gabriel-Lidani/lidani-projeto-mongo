package com.gabriellidani.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.gabriellidani.workshopmongo.domain.Post;
import com.gabriellidani.workshopmongo.domain.User;
import com.gabriellidani.workshopmongo.dto.AuthorDTO;
import com.gabriellidani.workshopmongo.repository.PostRepository;
import com.gabriellidani.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User gabriel = new User(null, "Gabriel Lidani", "gabriel@gmail.com");
		User nicoly = new User(null, "Nicoly Lidani", "nicoly@gmail.com");
		User mayla = new User(null, "Mayla Lidani", "mayla@gmail.com");
		
		userRepository.saveAll(Arrays.asList(gabriel, nicoly, mayla));
		
		Post post1 = new Post(null, sdf.parse("15/05/2026"), "Estudando Java", "Aprendendo sobre MongoDB!", new AuthorDTO(gabriel));
		Post post2 = new Post(null, sdf.parse("13/05/2026"), "Projeto postado", "Postando um projeto feito com Java e MongoDB.", new AuthorDTO(gabriel));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		System.out.println(postRepository.findAll());
		
		gabriel.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(gabriel);
	}
}
