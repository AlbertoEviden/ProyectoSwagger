package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.RepositorioPhone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone.EntidadUser;

@Repository
public interface RepositorioUser extends JpaRepository<EntidadUser, Long> {
    // Puedes añadir métodos personalizados si lo necesitas
}
