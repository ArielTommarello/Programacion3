package Ejericios.Herencia.entity.Sueldos;

public class Administrativo extends Categoria{
    @Override
    public void calcularSueldoNeto() {
        this.setSueldoNeto(40000);
    }
}
