package Ejericios.Herencia.entity.Sueldos;

public class BonoA extends Presentismo{

    @Override
    public double calcularBono(double ausentes) {
        if(ausentes==0)
        {
            return 1000;
        }if(ausentes==1){
            return 500;
      }
        return 0;
    }
}





