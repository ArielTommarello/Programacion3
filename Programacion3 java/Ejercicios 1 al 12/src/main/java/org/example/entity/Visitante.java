package org.example.entity;

public class Visitante extends Persona1 {

    private int dni;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public void presentarse(){
        System.out.println("Nombre: "+getNombre()+" "+"Apellido: "+getApellido());
    }

}
