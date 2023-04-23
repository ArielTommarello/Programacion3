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

    public Integer puntaje()
    {
        return 0;
    }

    public void visualizar(){
        this.setVisualizacion(this.getVisualizacion()+1);
    }


}
