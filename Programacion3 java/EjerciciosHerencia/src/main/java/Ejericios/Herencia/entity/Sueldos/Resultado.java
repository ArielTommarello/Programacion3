package Ejericios.Herencia.entity.Sueldos;

public abstract class Resultado {
    private boolean resultado;
    private Integer op;

    public abstract double calcularResultado(double neto);

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public Integer getOp() {
        return op;
    }

    public void setOp(Integer op) {
        this.op = op;
    }
}
