package Ejericios.Herencia.entity.FigurasGeometricas;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public void setRadio(double radio)
    {
        this.radio=radio;
    }
    public double getRadio()
    {
        return radio;
    }

    @Override
    public double CalcularPerimetro(){
        return (2*Math.PI*radio);
    }

    @Override
    public double CalcularArea(){

        return Math.pow(Math.PI*this.radio,2);
    }

    public void ImprimirCirculo()
    {
        System.out.println("Nombre: "+getName());
        System.out.println("Color: "+getColor());
        System.out.println("Radio: "+getRadio());
        System.out.println("Area: "+CalcularArea());
        System.out.println("Perimetro: "+CalcularPerimetro());
        System.out.println("------------------------------------");

    }

}
