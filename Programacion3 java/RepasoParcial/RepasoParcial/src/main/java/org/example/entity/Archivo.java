package org.example.entity;

import java.lang.annotation.Inherited;

public class Archivo implements Sistema {


    String nombre;
    Integer tamaño;

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setTamaño(Integer tamaño) {
        this.tamaño=tamaño;
    }

    @Override
    public Integer getTamaño() {
        return tamaño;
    }
}
