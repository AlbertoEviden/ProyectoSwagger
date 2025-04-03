package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.ControladorPhone;

import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/proyectos")
@Tag(name = "ControladorProyecto", description = "Gestión de proyectos")
public class ControladorProyecto {

    @GetMapping
    @Operation(summary = "Obtener todos los proyectos", description = "Devuelve una lista de proyectos de prueba.")
    public List<String> obtenerProyectos() {
        return Arrays.asList("Proyecto A", "Proyecto B", "Proyecto C");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un proyecto por ID", description = "Devuelve el nombre de un proyecto según su ID.")
    public String obtenerProyectoPorId(@PathVariable int id) {
        List<String> proyectos = Arrays.asList("Proyecto A", "Proyecto B", "Proyecto C");
        return (id >= 0 && id < proyectos.size()) ? proyectos.get(id) : "Proyecto no encontrado";
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo proyecto", description = "Agrega un nuevo proyecto (simulado).")
    public String crearProyecto(@RequestParam String nombre) {
        return "Proyecto '" + nombre + "' creado exitosamente.";
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un proyecto", description = "Elimina un proyecto según su ID (simulado).")
    public String eliminarProyecto(@PathVariable int id) {
        return "Proyecto con ID " + id + " eliminado exitosamente.";
    }
}
