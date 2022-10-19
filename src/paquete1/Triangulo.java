package paquete1;

public class Triangulo extends Poligono{

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String toString(){
        return "Numero de lados: "+numeroLados+"\nLado 1: "+lado1+"\nLado 2: "+lado2+"ºnLado 3: ";
    }

    public double area(){
        double semiperimetro;
        semiperimetro = (lado1+lado2+lado3)/2;
        return Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
    }
}
