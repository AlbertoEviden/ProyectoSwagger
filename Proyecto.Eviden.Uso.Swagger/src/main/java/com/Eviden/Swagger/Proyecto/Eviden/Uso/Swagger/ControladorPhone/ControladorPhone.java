package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.ControladorPhone;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone.EntidadPhone;
import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.ServicePhone.ServicePhone;

@RestController
@RequestMapping("/api/phones")  // Ruta base de la API
public class ControladorPhone {

    @Autowired
    private ServicePhone servicePhone;

    // 📌 Crear un nuevo teléfono
    @PostMapping
    public EntidadPhone createPhone(@RequestBody EntidadPhone phone) {
        return servicePhone.createPhone(phone);
    }

    // 📌 Obtener todos los teléfonos
    @GetMapping
    public List<EntidadPhone> getAllPhones() {
        return servicePhone.findAll();
    }

    // 📌 Obtener un teléfono por ID
    @GetMapping("/{id}")
    public Optional<EntidadPhone> getPhoneById(@PathVariable Long id) {
        return servicePhone.encontrarValor(id);
    }

    // 📌 Eliminar todos los teléfonos
    @DeleteMapping
    public void deleteAllPhones() {
        servicePhone.deleteAll();
    }
}

