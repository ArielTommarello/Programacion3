package Ejericios.Herencia.entity.Sueldos;

public class ResPorcentaje extends Resultado{

    @Override
    public double calcularResultado(double neto){
        return (neto*10)/100;
    }
}
