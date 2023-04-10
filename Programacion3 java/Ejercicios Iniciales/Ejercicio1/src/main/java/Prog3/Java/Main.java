package Prog3.Java;

/*Ejercicio - Figuras geométricas

Desarrollar una aplicación que permita conocer el área y el perímetro de un triángulo, de un cuadrado y de un círculo.

Cada figura posee un nombre y un color.

La aplicación debe permitir obtener para cada una de las figuras su nombre, color, perímetro y área.

a. Para probar esta aplicación, cree por lo menos 1 figura de cada tipo y muestre el resultado de invocar a sus métodos.

b. Implemente la misma solución utilizando polimorfismo.*/

import Prog3.Java.entity.Circulo;
import Prog3.Java.entity.Cuadrado;
import Prog3.Java.entity.FiguraGeometrica;
import Prog3.Java.entity.Triangulo;

public class Main {
    public static void main(String[] args) {

        Circulo circ = new Circulo();
        circ.setNombre("Circulo");
        circ.setColor("Rojo");
        circ.setRadio(9);
        System.out.println("Nombre: "+circ.getNombre());
        System.out.println("Color: "+circ.getColor());
        System.out.println("Perimetro Circulo: "+circ.calcularPerimetro());
        System.out.println("Area Circulo: "+circ.calcularArea());
        System.out.println("-----------------------------------");
       Triangulo tri = new Triangulo();
        tri.setNombre("Triangulo");
        tri.setColor("Azul");
        tri.setLado1(20);
        tri.setLado2(8);
        tri.setLado3(20);
        System.out.println("Nombre: "+tri.getNombre());
        System.out.println("Color: "+tri.getColor());
        System.out.println("Perimetro Triangulo: "+tri.calcularPerimetro());
        System.out.println("Area Triangulo: "+tri.calcularArea());
        System.out.println("-----------------------------------");
        Cuadrado cuad=new Cuadrado();
        cuad.setNombre("Cuadrado");
        cuad.setColor("Blanco");
        cuad.setLado(5);
        System.out.println("Nombre: "+cuad.getNombre());
        System.out.println("Color: "+cuad.getColor());
        System.out.println("Perimetro Cuadrado: "+cuad.calcularPerimetro());
        System.out.println("Area Cuadrado: "+cuad.calcularArea());
        System.out.println("-----------------------------------");

    }
}