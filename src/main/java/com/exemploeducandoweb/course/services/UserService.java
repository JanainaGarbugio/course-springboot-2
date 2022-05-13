// ctrl + shift + o = limpa os imports 
package com.exemploeducandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.exemploeducandoweb.course.entities.User;
import com.exemploeducandoweb.course.repositories.UserRepository;

//@Component - registra a classe como um componente do spring, que pode ser injetado com @autowired

@Service
public class UserService {

	@Autowired //injeção de dependencia explicita
	private UserRepository repository;
	
	public List<User> findAll() { 
	//o método faz uma operação na camada service
		return repository.findAll(); 
	//ele retorna/repassa a chamada para a camada repository
	}
	
	@GetMapping
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
