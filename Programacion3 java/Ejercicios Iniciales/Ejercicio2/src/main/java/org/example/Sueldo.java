package org.example;
public class Sueldo {

    public Double calcularSueldo(Empleado e){
        Double sueldoF = e.getCategoria().getSueldoBruto() + e.getPresentismo().calcularPresentismo(e.getDiasAusentes());
        if(e.getResultado().getOpcion() == 1){
            sueldoF = sueldoF + e.getResultado().calcularBonoXPorcenje(sueldoF);
        }

        if(e.getResultado().getOpcion() == 2){
            sueldoF = sueldoF + e.getResultado().calcularBonoFijo(sueldoF);
        }
        return sueldoF;
    }

}
