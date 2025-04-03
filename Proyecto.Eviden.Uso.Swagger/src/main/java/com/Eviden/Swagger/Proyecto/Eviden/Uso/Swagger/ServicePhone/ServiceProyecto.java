package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.ServicePhone;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone.EntidadPhone;
import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone.EntidadProyecto;
import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.RepositorioPhone.RepositorioProyecto;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ServiceProyecto {
	
	@Autowired
	private RepositorioProyecto repositorioProyecto;
	
	public void deleteAll() {
		repositorioProyecto.deleteAll();
	}
	
	public EntidadProyecto createProyecto(EntidadProyecto entidadProyecto) {
		return repositorioProyecto.save(entidadProyecto);
	}
	
	public List<EntidadProyecto> findAll(){
		return repositorioProyecto.findAll();
	}
	
	public Optional<EntidadProyecto> findById(Long id){
		return repositorioProyecto.findById(id);
	}

}


