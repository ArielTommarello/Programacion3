package org.example.entity;

public class Persona1 {

    private String nombre;
    private String apellido;


    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse(){
        System.out.println("Nombre y Apellido: "+getNombre()+" "+getApellido());
    }


}
