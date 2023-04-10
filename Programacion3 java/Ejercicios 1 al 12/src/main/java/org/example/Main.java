package org.example;

import org.example.entity.*;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.name= "Ariel";
        person.lastName="Tommarello";
        System.out.println("----EJERCICIO 1----");
        System.out.println("Hello my Name is "+person.name + " " +person.lastName);
        System.out.println("----EJERCICIO 2----");
        Vehiculo auto = new Vehiculo();
        auto.marca="Fiat";
        auto.modelo="Duna";
        auto.setPatente("TAL 474");
        System.out.println("Auto - Marca: "+auto.marca + " /Modelo: " +auto.modelo + " /Patente: "+auto.getPatente());
        System.out.println("----EJERCICIO 3----");
        Articulo art=new Articulo();
        art.setMarca("Staedtler");
        art.setModelo("rasoplast");
        System.out.println("Articulo 001- Marca: "+art.getMarca() + " Modelo: " +art.getModelo());
        System.out.println("----EJERCICIO 4----");
        Cine peli = new Cine();
        peli.setPelicula("Rocky V");
        peli.setHorario(1200);
        peli.obtenerCartelera();
        System.out.println("----EJERCICIO 5----");
        Cine peli1 = new Cine();
        peli1.setPelicula("Rocky 1");
        peli1.setHorario(1430);
        peli1.obtenerCartelera();
        Cine peli2 = new Cine();
        peli2.setPelicula("Rocky 2");
        peli2.setHorario(1645);
        peli2.obtenerCartelera();
        System.out.println("------------------------------------------");
        peli1.setPelicula("Rocky 3");
        peli1.setHorario(1730);
        peli1.obtenerCartelera();
        peli2.obtenerCartelera();
        System.out.println("----EJERCICIO 6----");
        Fruta fruta1=new Fruta();
        fruta1.setPeso(100);
        fruta1.setColor("Rojo");
        fruta1.setEsEstacional(true);
        boolean aux;
        aux=fruta1.esComestible(fruta1.getPeso(),fruta1.isEsEstacional());
        fruta1.verComestible(aux);
        System.out.println("----EJERCICIO 7----");
        Ninja nj1 = new Ninja();
        Ninja nj2 = new Ninja();
        nj2.setArteMarcial("Karate");
        nj2.setArma("Katana");
        nj2.setSalto(150);
        nj2.setFuerza(200);
        nj1.setArteMarcial("Win Chun");
        nj1.setArma("Boke");
        nj1.setSalto(200);
        nj1.setFuerza(100);
        System.out.println("NINJA 1----");
        nj1.saltar();
        nj1.ataque();
        System.out.println("NINJA 2----");
        nj2.saltar();
        nj2.ataque();
        System.out.println("----EJERCICIO 9----");
        Persona1 people=new Persona1();
        Persona1 visitor=new Visitante();
        Persona1 guardia=new Guardia();
        people.setNombre("Arielo");
        people.setApellido("Tommarellinski");
        visitor.setNombre("Lucatoni");
        visitor.setApellido("Monthez");
        guardia.setNombre("Etzekiel");
        guardia.setApellido("Verelhe");
        people.presentarse();
        guardia.presentarse();
        visitor.presentarse();
        System.out.println("----EJERCICIO 10----");
        people.presentarse();
        guardia.presentarse();
        System.out.println("----EJERCICIO 11----");
        ((Visitante) visitor).setDni(40009641);
        ((Guardia) guardia).controlarDocumento1(((Visitante) visitor));//cambiado porque se tuvo que tocar el controlarDocumento
        System.out.println("----EJERCICIO 12----");
        ((Guardia) guardia).controlarDocumento(((Visitante) visitor));
    }



}