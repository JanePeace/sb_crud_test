package com.tapir.app.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tapir {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int edadAnimal;
    private String nombre;
    private Float pesoKilos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEdadAnimal() {
        return edadAnimal;
    }

    public void setEdadAnimal(int edadAnimal) {
        this.edadAnimal = edadAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPesoKilos() {
        return pesoKilos;
    }

    public void setPesoKilos(Float pesoKilos) {
        this.pesoKilos = pesoKilos;
    }
}

