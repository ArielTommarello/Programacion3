package prog3.Biblioteca.entity;

public class Matematica extends Libro{
    @Override
    public Integer calcularTotalPrestamo(Integer caps)
    {

        if (caps==1){
            return 7;
        }
        else{
            return 21;
        }

    }
}
