package com.company;

import java.util.Scanner;

public class Sesion3 {

    static Scanner teclado = new Scanner(System.in);

    static int entradaMenu;

    //Método utilizado para terminar los diferentes cases del switch
    public static void finalizarOpcion(){

        int respuesta;
        boolean respuestaIncorrecta = false;

        System.out.println("\nEscriba 0 para volver al menú de inicio y 1 para salir de la aplicación.");
        do {
            respuesta = teclado.nextInt();
            if (respuesta == 1) entradaMenu = 0;
            else if (respuesta != 0) {
                System.out.println("Opción Incorrecta. Intenta de nuevo.");
                respuestaIncorrecta = true;
            }
        } while(respuestaIncorrecta);
    }

    static void ejecutarOpcion(int entradaMenu){

        switch (entradaMenu) {
            case 0:
                System.out.println("Adiós");
                break;

            case 1:
                System.out.println("Introduzca un número entre 1 y 1000:");
                int numeroCase1 = leerNumero(1, 1000);

                if (Sesion2.esPrimo(numeroCase1)) System.out.println("El número " + numeroCase1 + " sí es primo.");
                else System.out.println("El número " + numeroCase1 + " no es primo.");

                finalizarOpcion();
                break;

            case 2:
                System.out.println("Introduzca un número comprendido entre 1 y 100");
                int numeroCase2 = leerNumero(1, 100);
                escribePrimos(numeroCase2);
                System.out.println();

                finalizarOpcion();
                break;

            case 3:
                System.out.println("introduzca un número entero comprendido entre 1 y 500:");
                int numeroCase3_1 = teclado.nextInt();
                System.out.println("introduzca otro entero comprendido entre 1 y 500:");
                int numeroCase3_2 = teclado.nextInt();
                Sesion4.primosGemelos(numeroCase3_1, numeroCase3_2);

                finalizarOpcion();
                break;

            case 4:
                System.out.println("Introduzca un número par comprendido entre 3 y 500");
                int numeroCase4;
                boolean numeroCorrecto = false;
                do {
                    numeroCase4 = teclado.nextInt();
                    if ((numeroCase4 >= 3) && (numeroCase4 <= 500) && (numeroCase4%2 == 0)) numeroCorrecto = true;
                    else System.out.println("Número incorrecto, intente de nuevo");
                } while(!numeroCorrecto);

                Sesion4.mostrarSumasDePrimos(numeroCase4);

                finalizarOpcion();
                break;

            case 5:
                System.out.println("Introduzca un número entre 1 y 1000:");
                int numeroCase5 = leerNumero(1,1000);
                boolean esPrimo;
                esPrimo = Sesion4.esPrimoRecursivo(numeroCase5,2);
                if (esPrimo) System.out.println("El numero "+numeroCase5+" sí es primo");
                else System.out.println("El numero "+numeroCase5+" no es primo");

                finalizarOpcion();
                break;

            case 6:
                System.out.println("Introduzca un numero entre -100 y 100 (base):");
                int numeroCase6_1 = leerNumero(-100,100);
                System.out.println("Introduzca un número entre 0 y 10 (exponente):");
                int numeroCase6_2 = leerNumero(0,10);
                double resultado = Sesion4.potencia(numeroCase6_1, numeroCase6_2);
                System.out.println("El resultado de "+numeroCase6_1+" elevado a "+numeroCase6_2+" es "+resultado);

                finalizarOpcion();
                break;

            default:
                System.out.println("Entrada incorrecta. Intente de nuevo");
        }
    }

    //Apartado 1
    static int menu(){
        System.out.println("1. Comprobar si un número es primo.");
        System.out.println("2. Escribir los n primeros números primos");
        System.out.println("3. Escribir la lista de los números primos gemelos comprendidos entre dos valores.");
        System.out.println("4. Mostrar todas las formas posibles de escribir un número par como suma de dos números primos");
        System.out.println("5. Comprobar si un número es primo de forma recusrsiva.");
        System.out.println("6. Hacer una potencia");
        System.out.println("0. Finalizar la ejecución.");
        System.out.println("Introduzca la opción deseada (número entre 0 y 6):");

        return leerNumero(0, 6);
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
    //Ya realizado en la sesion 2: Sesion2.esPrimo();

    //Apartado 4
    static void escribePrimos(int numeroDePrimos){

        int contador = 2;

        for (int i = 0; i < numeroDePrimos;) {
            if (Sesion2.esPrimo(contador)) {
                if (i%4 == 0) System.out.println();
                System.out.printf("%8s", contador);
                i++;
            }
            contador++;
        }
    }

    //Apartado 5
    public static void main(String []args){
        do {
            entradaMenu = menu();
            ejecutarOpcion(entradaMenu);
        } while(entradaMenu != 0);
    }
}
