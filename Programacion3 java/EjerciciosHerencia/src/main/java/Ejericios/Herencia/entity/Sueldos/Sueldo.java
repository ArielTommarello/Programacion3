package Ejericios.Herencia.entity.Sueldos;

public class Sueldo {
    public Double calcularSueldo(Empleado e){
        Double sueldoF;
        sueldoF = e.getCat().getSueldoNeto() + e.getPres().calcularBono(e.getAusentes()+e.getPres().calcularBono(e.getAusentes()));
        if(e.getRes().getOp() == 1){
            sueldoF = sueldoF + e.getRes().calcularResultado(e.getCat().getSueldoNeto());
        }

        if(e.getRes().getOp() == 2){
            sueldoF = sueldoF + e.getRes().calcularResultado(e.getCat().getSueldoNeto());
        }
        return sueldoF;
    }

}
