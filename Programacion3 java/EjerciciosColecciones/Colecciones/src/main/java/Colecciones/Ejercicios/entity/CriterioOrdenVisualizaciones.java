package Colecciones.Ejercicios.entity;

import java.util.Comparator;

public class CriterioOrdenVisualizaciones implements Comparator<Pelicula> {

    public int compare(Pelicula p1,Pelicula p2)
    {
        return p1.getVisualizacion().compareTo(p2.getVisualizacion());
    }

}
