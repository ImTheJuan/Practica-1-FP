package com.company;
import java.util.Scanner;

public class Sesion2 {

    public static boolean esPrimo(int numero){

        int contador = 2;
        boolean esDivisible;
        boolean esUnPrimo = (numero != 1) && (numero != 0);

        while ((contador <= numero) && esUnPrimo) {
            esDivisible = numero % contador == 0;
            if (numero != contador) {
                if (esDivisible) esUnPrimo = false;
            }
            contador++;
        }
        return esUnPrimo;
    }

    public static void main(String []args){

        //Apartado 1
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un número entero entre 0 y 1000:");
        int numero = teclado.nextInt();

        if ((numero >= 0)&&(numero <= 1000)) {
            System.out.println("Tu número elegido es: " + numero);
            if (esPrimo(numero)) System.out.println("El número " + numero + " sí es primo");
            else System.out.println("El número " + numero + " no es primo");
        }
        else System.out.println("Ha elegido un número incorrecto.");

        //Apartado 2
        System.out.println("Introduzca un número entero entre 5 y 20:");
        int numeroDePrimos = teclado.nextInt();
        int contador = 2;

        if ((numeroDePrimos >= 5) && (numeroDePrimos <= 20)){
            for (int i = 0; i < numeroDePrimos;) {

                if (esPrimo(contador)) {
                    if ((i%4 == 0)&&(i!=0)) System.out.println();
                    System.out.printf("%8d", contador);
                    i++;
                }
                contador++;
            }
        }
        else System.out.println("El número seleccionado está fuera de los límites establecidos.");
    }
}
