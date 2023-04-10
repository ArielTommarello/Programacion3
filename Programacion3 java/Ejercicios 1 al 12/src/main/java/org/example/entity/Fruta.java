package org.example.entity;

public class Fruta {

    private String color;
    private float peso;
    private boolean esEstacional;


    public float getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

   public boolean isEsEstacional() {
       return esEstacional;
   }



    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEsEstacional(boolean esEstacional) {
        this.esEstacional = esEstacional;
    }

    public boolean esComestible(float peso, boolean esEstacional){
        if ((peso <= 200)&&(esEstacional)) {
            return true;
        }
        return false;
    }

    public void verComestible(boolean aux)
    {
        if (aux)
        {
            System.out.println("Es comestible");
        }
        else {
            System.out.println("No Es comestible");
        }
    }



}
