package com.Eviden.Swagger.Proyecto.Eviden.Uso.Swagger.EntidadPhone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EntidadPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usa una estrategia adecuada para la generación del ID
    private Long id;

    private String numero;
    private String operador;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
}
