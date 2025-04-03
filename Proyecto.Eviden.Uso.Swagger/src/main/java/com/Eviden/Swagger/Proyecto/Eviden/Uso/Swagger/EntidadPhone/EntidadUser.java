package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EntidadUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Usa una estrategia adecuada para la generación del ID

	private Long id;
	private String nick;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EntidadUser(Long id, String nick, String name) {
		this.id = id;
		this.nick = nick;
		this.name = name;
	}

	public EntidadUser() {
	}

}
