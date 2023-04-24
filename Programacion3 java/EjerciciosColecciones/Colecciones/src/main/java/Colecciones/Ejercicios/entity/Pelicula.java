package Colecciones.Ejercicios.entity;



public class Pelicula {

    private String titulo;

    private Fecha fecha;
    private String descripcion;

    private String paisOrigen;

    private Integer visualizacion;



    public Pelicula(String t,Fecha f,String d,String p,Integer v)
    {
        titulo=t;
        fecha=f;
        descripcion=d;
        paisOrigen=p;
        visualizacion=v;
    }



    public String getTitulo(){
        return titulo;
    }



    public String getDescripcion()
    {
        return descripcion;
    }

    public String getPaisOrigen()
    {
        return paisOrigen;
    }


    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Integer getVisualizacion() {
        return visualizacion;
    }

    public void setVisualizacion(Integer visualizacion) {
        this.visualizacion = visualizacion;
    }


    public  Integer calculadorAnios(){
        return(2023-this.getFecha().getAnio());
    }

    public Integer puntaje()
    {
        return (this.visualizacion*1000/this.calculadorAnios());
    }

    public void visualizar(){
        this.visualizacion++;
    }


    public void MostrarPuntaje(){
        System.out.println("Pelicula: "+this.getTitulo());
        System.out.println("Puntaje: "+this.puntaje());
        System.out.println("----------------------------");
    }



}
