package com.exemploeducandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

//implementação da interface serializable para trafegar na rede
public class User implements Serializable {
	private static final long serialVersionUID = 1L; //numero de serie do serializable

	// atributos basicos
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;

	// construtor vazio
	public User() {
	}

	// atalho: source > escolhe o comando
	// construtor que recebe todas as classes
	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	// getters & setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// por padrão, foi inserido somente o ID
	// HashCode e equals
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
