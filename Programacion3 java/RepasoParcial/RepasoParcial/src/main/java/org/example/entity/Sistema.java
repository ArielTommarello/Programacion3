package org.example.entity;

public interface Sistema {

    String nombre = null;
    Integer tamaño = null;

    public void setNombre(String nombre);
    public String getNombre();

    public void setTamaño(Integer tamaño);
    public Integer getTamaño();

}
