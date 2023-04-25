package Colecciones.Ejercicios;

import Colecciones.Ejercicios.entity.*;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Pelicula> pel=new LinkedList<Pelicula>();

        pel.add(0,new Pelicula("vengadores",new Fecha(03,05,1990),"Buena","Germandia",0));
        pel.add(0,new Pelicula("Jacinta Flores",new Fecha(01,03,1893),"Documental","Venezuela",0));
        pel.add(0,new Pelicula("merry Poppins",new Fecha(15,10,1980),"Fantasia","Inglaterra",0));
        pel.add(0,new Pelicula("Mundial 2022",new Fecha(18,12,2022),"La Tercera","Qatar",0));
        pel.add(0,new Pelicula("vengadores 2",new Fecha(04,07,1993),"Buena","Germandia",0));

        //4
        pel.get(0).visualizar();
        pel.get(0).visualizar();
        pel.get(0).visualizar();
        pel.get(0).visualizar();

        //2
        pel.get(1).visualizar();
        pel.get(1).visualizar();


        //7
        pel.get(2).visualizar();
        pel.get(2).visualizar();
        pel.get(2).visualizar();
        pel.get(2).visualizar();
        pel.get(2).visualizar();
        pel.get(2).visualizar();
        pel.get(2).visualizar();


        //5
        pel.get(3).visualizar();
        pel.get(3).visualizar();
        pel.get(3).visualizar();
        pel.get(3).visualizar();
        pel.get(3).visualizar();

        //2
        pel.get(4).visualizar();
        pel.get(4).visualizar();
        pel.get(4).visualizar();


        //.........Impresion
        for (int i=0;i<pel.size();i++){
            pel.get(i).MostrarPuntaje();
        }
        //Ordenar Asc Visualizacion
        Collections.sort(pel,new CriterioOrdenVisualizaciones());
        for (int i=0;i<pel.size();i++){
            pel.get(i).MostrarPelicula();
        }

        System.out.println(".........................");

        //Ordenar Desc Estreno
        Collections.sort(pel,new CriterioOrdenDescEstreno());
        for (int i=0;i<pel.size();i++){
            pel.get(i).MostrarPelicula();
        }
        System.out.println(".........................");
        System.out.println("Ejercicio2");

        //Inicializar Alumno



        Hashtable<Integer,Alumno> alumnos = new Hashtable<Integer, Alumno>();

        alumnos.put(001,new Alumno(001,"ariel","tommarello"));
        Materia materias=new Materia();




    }
}