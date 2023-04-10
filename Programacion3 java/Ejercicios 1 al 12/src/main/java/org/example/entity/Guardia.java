package org.example.entity;

public class Guardia extends Persona1{

    @Override
    public void presentarse(){
        System.out.println("Hola mi nombre es "+getNombre()+" "+getApellido()+" y soy el guardia.");
    }

    public void controlarDocumento(Visitante vsj)
    {
        System.out.println("Adelante persona con dni: "+vsj.getDni()+" "+"cuyo nombre es: "+vsj.getNombre()+" "+vsj.getApellido());
    }

    public void controlarDocumento1(Visitante vsj)
    {
        System.out.println("Adelante persona con dni: "+vsj.getDni());
    }
}
