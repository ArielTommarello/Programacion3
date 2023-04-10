package Prog3.Java.entity;


public class Triangulo extends FiguraGeometrica{

private Integer lado1;
private Integer lado2;
private  Integer lado3;

   public Integer getLado1() {
        return lado1;
    }

    public Integer getLado2() {
        return lado2;
    }

    public Integer getLado3() {
        return lado3;
    }

    public void setLado1(Integer lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(Integer lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(Integer lado3) {
        this.lado3 = lado3;
    }


    @Override
    public double calcularPerimetro(){
        return lado1+lado2+lado3;
    }
    @Override
    public double calcularArea(){
        double semiPer=this.calcularPerimetro()/2;
        double area=Math.sqrt(semiPer*(semiPer-lado1)*(semiPer-lado1)*(semiPer-lado1));
        return area;
    }
}
