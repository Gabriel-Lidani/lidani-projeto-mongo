package com.gabriellidani.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriellidani.workshopmongo.domain.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User gabriel = new User("1", "Gabriel Luiz", "gabriel@gmail.com");
		User nicoly = new User("2", "Nicoly de Souza", "nicoly@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(gabriel, nicoly));
		return ResponseEntity.ok().body(list);
	}
}
