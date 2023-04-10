package Ejericios.Herencia.entity.Sueldos;

public abstract  class Presentismo {

    private boolean bono;

    public boolean isBono() {
        return bono;
    }

    public void setBono(boolean bono) {
        this.bono = bono;
    }

    public abstract double calcularBono(Integer ausentes);


}
