package Ejericios.Herencia.entity.Sueldos;

public abstract class  Categoria {
    private double sueldoNeto;


    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public double getSueldoNeto()
    {
        return sueldoNeto;
    }
    public abstract void calcularSueldoNeto();
}
