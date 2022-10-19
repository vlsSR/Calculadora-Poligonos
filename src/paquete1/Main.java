package paquete1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;
        int numeroLados, cantidadPoligonos, i = 0;

        System.out.println("Cuantos poligonos quieres almacenar: ");
        cantidadPoligonos = sc.nextInt();

        //Bucle crear y llenar array poligono
        Poligono poligonos[] = new Poligono[cantidadPoligonos];
        do {
            System.out.println("Introduce el numero de lados 3 o 4");
            numeroLados = sc.nextInt();

            if (numeroLados == 3) {
                System.out.println("Introduce el lado 1");
                lado1 = sc.nextDouble();
                System.out.println("Introduce el lado 2");
                lado2 = sc.nextDouble();
                System.out.println("Introduce el lado 3");
                lado3 = sc.nextDouble();

                poligonos[i] = new Triangulo(numeroLados, lado1, lado2, lado3);

                i++;
            }
            else if (numeroLados == 4) {
                System.out.println("Introduce el lado 1");
                lado1 = sc.nextDouble();
                System.out.println("Introduce el lado 2");
                lado2 = sc.nextDouble();

                poligonos[i] = new Rectangulo(numeroLados, lado1, lado2);

                i++;
            }
            else{
                System.out.println("El numero de lados no es correcto, vuelva a introducir los datos del poligono");
            }
        } while (i < cantidadPoligonos);

        //Bucle mostrar los datos y las areas de cada objeto
        for (int j = 0; j < cantidadPoligonos; j++){
            if(poligonos[j].numeroLados == 3){
                Triangulo triangulo = (Triangulo) poligonos[j];
                System.out.println("Los datos del poligono "+(j+1)+" que es un triangulo son: ");
                System.out.println(triangulo.toString());
                System.out.println("El area es de: ");
                System.out.println(triangulo.area());
            }
            else{
                Rectangulo rectangulo = (Rectangulo) poligonos[j];
                System.out.println("Los datos del poligono "+(j+1)+" que es un rectangulo son: ");
                System.out.println(rectangulo.toString());
                System.out.println("El area es de: ");
                System.out.println(rectangulo.area());
            }
        }
    }
}
