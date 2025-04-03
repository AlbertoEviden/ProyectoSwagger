package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.ServicePhone;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone.EntidadPhone;
import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.RepositorioPhone.RepositorioPhone;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ServicePhone {

	@Autowired
	private RepositorioPhone repositorioPhone;
	
	public void deleteAll() {
		repositorioPhone.deleteAll();
	}
	
	public EntidadPhone createPhone(EntidadPhone phone) {
		return repositorioPhone.save(phone) ;
		
	}
	
	public Optional<EntidadPhone> encontrarValor(Long id) {
		return repositorioPhone.findById(id);
	}
	
	public List<EntidadPhone> findAll(){
		return repositorioPhone.findAll();
	}
}
