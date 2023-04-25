package Colecciones.Ejercicios.entity;

import java.util.ArrayList;
import java.util.Hashtable;

public class Materia extends Hashtable<Integer,Alumno> {

    private Integer codMateria;
    private String materia;
    private Integer nota1;

    private Integer nota2;

    public Integer getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(Integer codMateria) {
        this.codMateria = codMateria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }
}
