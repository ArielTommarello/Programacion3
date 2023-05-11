package Colecciones.Ejercicios.entity;

import java.util.ArrayList;

public class Alumno {

    private Integer legajo;
    private String Nombre;

    private String Apellido;
    private ArrayList<Materia> materias=new ArrayList<>();


    public Alumno(Integer l,String n,String ap,ArrayList<Materia>m){
        legajo=l;
        Nombre=n;
        Apellido=ap;
        materias=m;
    }


    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
}
