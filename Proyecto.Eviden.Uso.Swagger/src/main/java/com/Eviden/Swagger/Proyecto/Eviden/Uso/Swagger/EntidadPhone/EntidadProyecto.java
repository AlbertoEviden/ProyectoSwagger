package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EntidadProyecto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usa una estrategia adecuada para la generación del ID
	
	private Long id;
	private String description;
	private String languaje;
	private String open;
	
	public EntidadProyecto(Long id, String description, String languaje, String open) {
		super();
		this.id = id;
		this.description = description;
		this.languaje = languaje;
		this.open = open;
	}

	public EntidadProyecto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguaje() {
		return languaje;
	}

	//Proyecto de prueba Alberto Campanero

	public void setLanguaje(String languaje) {
		this.languaje = languaje;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}
	
	
	
	
	
	
}
