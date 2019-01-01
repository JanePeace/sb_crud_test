package com.tapir.app.controller.request;

import com.tapir.app.jpa.model.Tapir;

public class TapirDto {
    private int edadAnimal;
    private String nombre;
    private Float pesoKilos;

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

    public Tapir convertTo() {
        Tapir result = new Tapir();
        result.setEdadAnimal(edadAnimal);
        result.setNombre(nombre);
        result.setPesoKilos(pesoKilos);
        return result;
    }
}
