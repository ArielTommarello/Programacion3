package Colecciones.Ejercicios;

import Colecciones.Ejercicios.entity.Fecha;
import Colecciones.Ejercicios.entity.Pelicula;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Pelicula> pel=new LinkedList<Pelicula>();

      pel.add(0,new Pelicula("vengadores",new Fecha(03,05,1990),"Buena","Germandia",0));
        pel.add(0,new Pelicula("Jacinta Flores",new Fecha(01,03,1893),"Documental","Venezuela",0));
        pel.add(0,new Pelicula("merry Poppins",new Fecha(15,10,1980),"Fantasia","Inglaterra",0));
        pel.add(0,new Pelicula("Mundial 2022",new Fecha(18,12,2022),"La Tercera","Qatar",0));
        pel.add(0,new Pelicula("vengadores 2",new Fecha(04,07,1993),"Buena","Germandia",0));






    }
}