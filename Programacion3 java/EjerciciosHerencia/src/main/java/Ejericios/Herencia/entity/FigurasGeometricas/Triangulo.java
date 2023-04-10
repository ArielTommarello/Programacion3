package Ejericios.Herencia.entity.FigurasGeometricas;

public class Triangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;
    private double lado3;

    public void setLado1(double lado1)
    {
        this.lado1=lado1;

    }
    public double getLado1()
    {
        return lado1;
    }

    public void setLado2(double lado2)
    {
        this.lado2=lado2;

    }
    public double getLado2()
    {
        return lado2;
    }

    public void setLado3(double lado3)
    {
        this.lado3=lado3;
    }

    public double getLado3() {
        return lado3;
    }
    @Override
    public double CalcularPerimetro()
    {
        return lado1+lado2+lado3;
    }
    @Override
    public double CalcularArea()
    {
        double semiPer=this.CalcularPerimetro()/2;
        double area=Math.sqrt(semiPer*(semiPer-lado1)*(semiPer-lado1)*(semiPer-lado1));
        return area;
    }

    public void ImprimirTriangulo()
    {
        System.out.println("Nombre: "+getName());
        System.out.println("Color: "+getColor());
        System.out.println("Lados: "+getLado1()+"/"+getLado2()+"/"+getLado3());
        System.out.println("Area: "+CalcularArea());
        System.out.println("Perimetro: "+CalcularPerimetro());
        System.out.println("------------------------------------");

    }

}
