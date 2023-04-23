package Colecciones.Ejercicios.entity;

public class Fecha {

    private Integer dia;
    private Integer mes;
    private Integer anio;

    public Fecha(Integer d,Integer m,Integer a){
        dia=d;
        mes=m;
       anio=a;
    }
    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }



}
