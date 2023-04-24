package Colecciones.Ejercicios.entity;

import java.util.Comparator;

public class CriterioOrdenDescEstreno implements Comparator<Pelicula> {
    public int compare(Pelicula p1,Pelicula p2)
    {
        return -p1.getFecha().getAnio().compareTo(p2.getFecha().getAnio());
    }
}
