package Ejericios.Herencia.entity.Sueldos;

public class Cadete extends Categoria{

    @Override
    public void calcularSueldoNeto() {
        this.setSueldoNeto(1000);
    }
}
