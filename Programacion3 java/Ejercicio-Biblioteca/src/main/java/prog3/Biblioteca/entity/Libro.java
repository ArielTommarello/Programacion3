package prog3.Biblioteca.entity;

public abstract class Libro {

    private String nombre;
    private String categoria;
    private Integer capitulos;

    private Integer totalPrestamo;



    public abstract Integer calcularTotalPrestamo(Integer capitulos);



    public Integer getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Integer capitulos) {
        this.capitulos = capitulos;
    }
}
