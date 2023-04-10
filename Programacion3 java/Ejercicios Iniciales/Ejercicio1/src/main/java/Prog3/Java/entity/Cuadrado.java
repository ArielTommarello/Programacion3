package Prog3.Java.entity;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularPerimetro(){
        return lado*4;
    }
    @Override
    public double calcularArea(){
    return lado*lado;

    }

}
