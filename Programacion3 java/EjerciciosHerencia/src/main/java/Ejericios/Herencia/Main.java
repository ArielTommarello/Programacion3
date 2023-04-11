package Ejericios.Herencia;
import Ejericios.Herencia.entity.FigurasGeometricas.*;
import Ejericios.Herencia.entity.Sueldos.*;
public class Main {
    public static void main(String[] args) {

        Triangulo tri=new Triangulo();
        Circulo circ=new Circulo();
        Cuadrado cuad=new Cuadrado();

        //Triangulo definiciones
        tri.setName("Triangulo");
        tri.setColor("Blue");
        tri.setLado1(2);
        tri.setLado2(3);
        tri.setLado3(3);

        //Circulo Definiciones
        circ.setName("Circulo");
        circ.setColor("Red");
        circ.setRadio(8.5);

        //Cuadrado Definiciones
        cuad.setName("Cuadrado");
        cuad.setColor("Green");
        cuad.setLado(9);

      //Impresiones
       tri.ImprimirTriangulo();
       circ.ImprimirCirculo();
       cuad.ImprimirCuadrado();

        System.out.println("-----------------------------------------------------");
        System.out.println("                     Ejercicio2                       ");

       //Ejercicio2

        Empleado Pepe = new Empleado();
        Gerente PepeGerente = new Gerente();
        BonoA BonoPepe = new BonoA();
        BonoB BonoBPepe = new BonoB();

        Pepe.setNombre("Pepe");
        BonoPepe.setBono(false);
        BonoBPepe.setBono(true);
        Pepe.setAusentes(5);

        Resultado resPepe = new ResCero();
        resPepe.setResultado(true);
        resPepe.setOp(1);

        PepeGerente.calcularSueldoNeto();
        Pepe.setCat(PepeGerente);

        if (BonoPepe.isBono()) {
            Pepe.setPres(BonoPepe);
        }

        if(BonoBPepe.isBono()){
            Pepe.setPres(BonoBPepe);
        }

        Pepe.setRes(resPepe);

        Sueldo s = new Sueldo();

        Double sueldo = s.calcularSueldo(Pepe);
        System.out.println("Nombre del empleado: " + Pepe.getNombre());
        System.out.println("Sueldo : " + sueldo);


    }
}