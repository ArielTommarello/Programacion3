package org.example.entity;

public class Ninja {

    private String arteMarcial;
    private String arma;
    private int fuerza;
    private int salto;

    public void setArteMarcial(String arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    public String getArteMarcial() {
        return arteMarcial;
    }

    public String getArma() {
        return arma;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getSalto() {
        return salto;
    }


    public void saltar()
    {
        System.out.println("El salto es de: "+getSalto());
    }

    public void ataque()
    {
        System.out.println("Arte Marcial: "+getArteMarcial()+" / "+"Arma: "+getArma());
    }



}
