package com.exemploeducandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploeducandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
