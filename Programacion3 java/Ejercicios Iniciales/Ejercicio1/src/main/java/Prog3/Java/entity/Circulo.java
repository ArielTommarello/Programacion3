package Prog3.Java.entity;

public class Circulo extends FiguraGeometrica{


    private float radio;


    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }


    @Override
    public double calcularPerimetro(){
        return (2*Math.PI*radio);
    }

    @Override
    public double calcularArea(){

        return Math.pow(Math.PI*this.radio,2);
    }


}
