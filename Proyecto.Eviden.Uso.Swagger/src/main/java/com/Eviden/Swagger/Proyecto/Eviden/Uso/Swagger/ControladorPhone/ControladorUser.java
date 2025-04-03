package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.ControladorPhone;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone.EntidadUser;
import com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.RepositorioPhone.RepositorioUser;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class ControladorUser {

    @Autowired
    private RepositorioUser entidadUserRepository;

    // Obtener todos los usuarios
    @GetMapping
    public List<EntidadUser> getAllUsers() {
        return entidadUserRepository.findAll();
    }

    // Obtener un usuario por su id
    @GetMapping("/{id}")
    public ResponseEntity<EntidadUser> getUserById(@PathVariable Long id) {
        Optional<EntidadUser> user = entidadUserRepository.findById(id);
        if (user.isPresent()) {
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Crear un nuevo usuario
    @PostMapping
    public ResponseEntity<EntidadUser> createUser(@RequestBody EntidadUser user) {
        EntidadUser savedUser = entidadUserRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // Actualizar un usuario existente
    @PutMapping("/{id}")
    public ResponseEntity<EntidadUser> updateUser(@PathVariable Long id, @RequestBody EntidadUser userDetails) {
        Optional<EntidadUser> user = entidadUserRepository.findById(id);
        if (user.isPresent()) {
            EntidadUser existingUser = user.get();
            existingUser.setNick(userDetails.getNick());
            existingUser.setName(userDetails.getName());
            EntidadUser updatedUser = entidadUserRepository.save(existingUser);
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Eliminar un usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        Optional<EntidadUser> user = entidadUserRepository.findById(id);
        if (user.isPresent()) {
            entidadUserRepository.delete(user.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
