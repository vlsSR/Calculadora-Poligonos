package paquete1;

abstract public class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public String toString(){
        return "Numero de lados: "+numeroLados;
    }

    public abstract double area();
}
