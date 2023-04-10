package Ejericios.Herencia.entity.FigurasGeometricas;

public abstract class FiguraGeometrica {

    private String name;
    private String color;

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color)
    {
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public abstract double CalcularPerimetro();
    public abstract double CalcularArea();


}
