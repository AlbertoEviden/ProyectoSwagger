package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.RepositorioPhone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone.EntidadProyecto;  // Asegúrate de importar la entidad correcta

@Repository
public interface RepositorioProyecto extends JpaRepository<EntidadProyecto, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}
