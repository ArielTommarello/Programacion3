package Ejericios.Herencia;
import Ejericios.Herencia.entity.FigurasGeometricas.*;
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



    }
}