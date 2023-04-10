package Ejericios.Herencia.entity.Sueldos;

public class Operador extends Categoria{
    @Override
    public void calcularSueldoNeto() {
        this.setSueldoNeto(10500);
    }
}
