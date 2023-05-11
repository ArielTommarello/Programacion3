package Colecciones.Ejercicios.entity;

public class Materia {

    private String nombre;
    private boolean cursa;
    private double nota1;
    private double nota2;

    public Materia (String n ,boolean c,double n1,double n2){

        nombre=n;
        cursa=c;
        nota1=n1;
        nota2=n2;

    }



    public boolean isCursa() {
        return cursa;
    }

    public void setCursa(boolean cursa) {
        this.cursa = cursa;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
