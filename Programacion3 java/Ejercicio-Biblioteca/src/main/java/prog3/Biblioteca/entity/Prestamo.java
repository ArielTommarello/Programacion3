package prog3.Biblioteca.entity;
import prog3.Biblioteca.entity.*;

public class Prestamo {

    public static final Integer LIBROS_TOTALES=15;
    private Libro libro;

    private String personaPrestamo;

    private boolean estado;

    private Integer fechaInicio;


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getPersonaPrestamo() {
        return personaPrestamo;
    }

    public void setPersonaPrestamo(String personaPrestamo) {
        this.personaPrestamo = personaPrestamo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Integer getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Integer fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public Integer calcularPrestamo(){

       if (this.estado!=true)
       {
           return this.libro.calcularTotalPrestamo(this.libro.getCapitulos());
       }
       else {
           System.out.println("No se puede prestar");
       }
    return 0;
    }

    public Integer calcularTerminoPrestamo()
    {



    }

    public Integer calcularLibrosBiblioteca()
    {

    }

    public String imprimirNombrePrestamo()
    {


    }


}
