package com.exemploeducandoweb.course.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemploeducandoweb.course.entities.User;
import com.exemploeducandoweb.course.services.UserService;

//annotations
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll(); 
		//a lista irá receber o usuário que virá da camada UserService 
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //indica que a requisição aceita um id na url 
	//declaração de metodo
	public ResponseEntity<User> findById(@PathVariable Long id) { //qual o serviço da PathVariable
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj); //retorna com .ok para mostrar que teve sucesso 
	}
}
