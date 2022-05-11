package com.exemploeducandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemploeducandoweb.course.entities.User;

//annotations
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Janaina", "janaina@gmail.com", "11987650997", "102030");
		return ResponseEntity.ok().body(u);
	}
}
