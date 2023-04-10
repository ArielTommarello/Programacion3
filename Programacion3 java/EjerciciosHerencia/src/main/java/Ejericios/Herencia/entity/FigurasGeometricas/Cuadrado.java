package Ejericios.Herencia.entity.FigurasGeometricas;

public class Cuadrado extends FiguraGeometrica {

    private double lado;

    public double getLado()
    {
        return lado;
    }
    public void setLado(double lado)
    {
        this.lado=lado;
    }

    @Override
    public double CalcularPerimetro()
    {
        return lado*4;
    }

    @Override
    public double CalcularArea() {
        return lado*lado;
    }

    public void ImprimirCuadrado()
    {
        System.out.println("Nombre: "+getName());
        System.out.println("Color: "+getColor());
        System.out.println("Lados: "+getLado());
        System.out.println("Area: "+CalcularArea());
        System.out.println("Perimetro: "+CalcularPerimetro());
        System.out.println("------------------------------------");

    }


}
