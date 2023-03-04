package com.practica.practica.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Contactar {
    @NotEmpty(message = "El nombre no puede estar vacío")
    @Size(min=1, max=50)
    private String nombre;
    @NotEmpty(message = "El email no puede estar vacío")
    @Size(min=4, max=150)
    private String email;
    @NotEmpty(message = "El mensaje no puede estar vacío")
    @Size(min=1, max=500)
    private String mensaje;

    public Contactar() {}

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
}
