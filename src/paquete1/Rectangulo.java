package paquete1;

public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;

    public Rectangulo(int numeroLados, double lado1, double lado2) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public String toString(){
        return "Numero de lados: "+numeroLados+"\nLado 1: "+lado1+"\nLado 2: "+lado2;
    }

    public double area(){
        return lado1 * lado2;
    }
}
