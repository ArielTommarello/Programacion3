package Ejericios.Herencia;
import Ejericios.Herencia.entity.Celulares.Celular;
import Ejericios.Herencia.entity.Celulares.Iphone;
import Ejericios.Herencia.entity.Celulares.Motorola;
import Ejericios.Herencia.entity.Celulares.Persona;
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


        System.out.println("-----------------------------------------------------");
        System.out.println("                     Ejercicio3                       ");

        Persona Juliana = new Persona();
        Persona Catalina = new Persona();

        Iphone iphone = new Iphone();

        Juliana.setCelular(new Motorola());
        Catalina.setCelular(iphone);



        Juliana.setNombre("Juliana");
        Catalina.setNombre("Catalina");


        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        //JULIANA
        //Llamadas Motorola
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();

        /*
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();

        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();

        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        Juliana.getCelular().Llamada();
        */

        System.out.println("-----------------------------------------------------");
        //Consultar Bateria
        System.out.println("Cantidad de Bateria Celular de "+Juliana.getNombre()+" Marca: "+Juliana.getCelular().getMarca()+" es de: "+Juliana.getCelular().ConsultarBat());
        System.out.println("-----------------------------------------------------");
        //Esta el celular apagado
        if(Juliana.getCelular().CelApagado()!=true)
        {
            System.out.println("El Celular de :"+Juliana.getNombre()+" Marca: "+Juliana.getCelular().getMarca()+" no esta apagado y tiene :"+Juliana.getCelular().ConsultarBat()+" de bateria");
        }
        else{
            System.out.println("El Celular esta apagado y tiene :"+Juliana.getCelular().ConsultarBat()+" de bateria");
        }
        System.out.println("-----------------------------------------------------");
        //Recargar Celular
        Juliana.getCelular().RecargarCelular();


        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        //CATALINA
        iphone.setDuracion(15.0);
        Catalina.getCelular().Llamada();
        iphone.setDuracion(10.0);
        Catalina.getCelular().Llamada();
        iphone.setDuracion(34.0);
        Catalina.getCelular().Llamada();
        System.out.println("-----------------------------------------------------");
        //Consultar Bateria
        System.out.println("Cantidad de Bateria Celular de "+Catalina.getNombre()+" Marca: "+Catalina.getCelular().getMarca()+" es de: "+Catalina.getCelular().ConsultarBat());
        System.out.println("-----------------------------------------------------");
        //Esta el celular apagado
        if(Catalina.getCelular().CelApagado()!=true)
        {
            System.out.println("El Celular de :"+Catalina.getNombre()+" Marca: "+Catalina.getCelular().getMarca()+" no esta apagado y tiene :"+Catalina.getCelular().ConsultarBat()+" de bateria");
        }
        else{
            System.out.println("El Celular esta apagado y tiene :"+Catalina.getCelular().ConsultarBat()+" de bateria");
        }
        System.out.println("-----------------------------------------------------");
        //Recargar Celular
        Catalina.getCelular().RecargarCelular();
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("........");

    }
}