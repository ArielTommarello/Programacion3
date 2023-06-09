package Ejericios.Herencia.entity.Celulares;

public abstract class Celular {

public final static Double BAT_TOTAL_CINCO = 5.0;
private String marca;
private String modelo;
private double bateria;

private double duracion;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }
    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }



    public abstract double ConsultarBat();
    public abstract boolean CelApagado();

    public abstract void Llamada();

    public abstract void RecargarCelular();

    public abstract double GetBat();

}
