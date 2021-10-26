package com.company;

import java.util.Scanner;

public class Sesion3 {

    static Scanner teclado = new Scanner(System.in);

    static void ejecutarOpcion(int entradaMenu){

        switch (entradaMenu) {
            case 0:
                System.out.println("Adiós");
                break;

            case 1:
                System.out.println("Introduzca un número entre 1 y 1000:");
                int numeroCase1 = leerNumero(1, 1000);

                if (esPrimo(numeroCase1)) System.out.println("El número " + numeroCase1 + " sí es primo.");
                else System.out.println("El número " + numeroCase1 + " no es primo.");

                break;

            case 2:
                System.out.println("Introduzca un número comprendido entre 1 y 100");
                int numeroCase2 = leerNumero(1, 100);
                    escribePrimos(numeroCase2);
                    System.out.println();

                break;
        }
    }

    //Apartado 1
    static int menu(){
        System.out.println("1. Comprobar si un número es primo.");
        System.out.println("2. Escribir los n primeros números primos");
        System.out.println("3. Escribir la lista de los números primos gemelos comprendidos entre dos valores.");
        System.out.println("4. Mostrar todas las formas posibles de escribir un número par como suma de dos números primos");
        System.out.println("0. Finalizar la ejecución.");
        System.out.println("Introduzca la opción deseada (número entre 0 y 4):");

        return leerNumero(0, 4);
    }

    //Apartado 2
    static int leerNumero(int numero1,int  numero2){
        //numero1 debe ser < numero2
        int numeroUsuario;
        boolean numeroCorrecto = false;

        do {
            numeroUsuario = teclado.nextInt();
            if ((numeroUsuario >= numero1) && (numeroUsuario <= numero2)){
                numeroCorrecto = true;
            }
            else System.out.println("Número incorrecto, intente de nuevo");
        } while(!numeroCorrecto);
        return numeroUsuario;
    }

    //Apartado 3
    static boolean esPrimo(int numero){

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

    //Apartado 4
    static void escribePrimos(int numeroDePrimos){

        int contador = 2;

        for (int i = 0; i < numeroDePrimos;) {
            if (esPrimo(contador)) {
                if (i%4 == 0) System.out.println();
                System.out.printf("%8s", contador);
                i++;
            }
            contador++;
        }
    }

    //Apartado 5
    public static void main(String []args){
        int entradaMenu;
        do {
            entradaMenu = menu();
            ejecutarOpcion(entradaMenu);
        } while(entradaMenu != 0);
    }
}
