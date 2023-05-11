package org.example.entity;

import java.util.ArrayList;

public class Directorio implements Sistema{

    String nombre;
    Integer tamaño;

    ArrayList <Sistema> dir =new ArrayList<Sistema>();

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setTamaño(Integer tamaño) {
        this.tamaño=tamaño;
    }

    @Override
    public Integer getTamaño() {
        return tamaño;
    }



    public void agregarD(Sistema s){

      this.dir.add(s);

    }

    public void eliminarD(Sistema s){
        this.dir.remove(s);
    }

    public Integer obtenerTamaño()
    {
        Integer cont =0;
        Integer pos=0;

        while (!dir.isEmpty())
        {
            cont=cont+this.dir.get(pos).getTamaño();
            pos++;
        }
        return cont;
    }
}
