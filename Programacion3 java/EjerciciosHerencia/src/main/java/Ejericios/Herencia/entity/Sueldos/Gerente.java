package Ejericios.Herencia.entity.Sueldos;

public class Gerente extends Categoria{
    @Override
    public void calcularSueldoNeto() {
        this.setSueldoNeto(100000);
    }
}
