package Ejericios.Herencia.entity.Celulares;


public class Iphone extends Celular{


    private double duracion;
    public Iphone(){
        this.setMarca("Iphone");
        this.setModelo("Pro 14 MAX PRO PROFESIONAL");
        this.setBateria(Celular.BAT_TOTAL_CINCO );
        this.duracion=duracion;
    }



    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }


    @Override
    public double ConsultarBat() {
        return this.getBateria();
    }

    @Override
    public boolean CelApagado() {
        if (ConsultarBat()!=0.0){
            return false;
        }
        return true;
    }

    @Override
    public void Llamada() {
        this.setBateria(this.getBateria()-(0.001*this.getDuracion()));
        System.out.println("Su bateria a bajado!!!!! - Bateria actual: "+this.ConsultarBat());

    }

    @Override
    public void RecargarCelular() {

        this.setBateria(Celular.BAT_TOTAL_CINCO);
        System.out.println("Su bateria se esta cargando :::::::::20%");
        System.out.println("Su bateria se esta cargando :::::::::40%");
        System.out.println("Su bateria se esta cargando :::::::::80%");
        System.out.println("Su bateria se esta cargando :::::::::100%");
        System.out.println("Carga Completa!!! - Nivel de Bateria: "+this.ConsultarBat());

    }



}
