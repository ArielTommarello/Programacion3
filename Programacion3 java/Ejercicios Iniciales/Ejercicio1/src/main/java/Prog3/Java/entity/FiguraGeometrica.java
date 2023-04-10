package Prog3.Java.entity;

public abstract class FiguraGeometrica {
    private String nombre;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double  calcularPerimetro();
    public abstract double calcularArea();

    }


