package Ejericios.Herencia.entity.Sueldos;

public class Empleado {

    private Integer legajo;
    private String nombre;

    private Integer ausentes;

    private Categoria cat;

    private Resultado res;
    private Presentismo pres;


    public Integer getAusentes() {
        return ausentes;
    }

    public void setAusentes(Integer ausentes) {
        this.ausentes = ausentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public Resultado getRes() {
        return res;
    }

    public void setRes(Resultado res) {
        this.res = res;
    }

    public Presentismo getPres() {
        return pres;
    }

    public void setPres(Presentismo pres) {
        this.pres = pres;
    }
}
