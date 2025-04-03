package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.RepositorioPhone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone.EntidadPhone;

@Repository  
public interface RepositorioPhone extends JpaRepository<EntidadPhone, Long> {  
}
