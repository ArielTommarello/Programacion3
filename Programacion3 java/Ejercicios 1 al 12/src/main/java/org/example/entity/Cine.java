package org.example.entity;

public class Cine {
    private String pelicula;
    private int horario;

    public int getHorario() {
        return horario;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }


    public void obtenerCartelera()
    {
        System.out.println("CARTELERA HOYTS - "+ getCartelera());
    }

    private String getCartelera(){

        return "Pelicula: "+getPelicula()+" - "+"Horario: "+getHorario();
    }
}
