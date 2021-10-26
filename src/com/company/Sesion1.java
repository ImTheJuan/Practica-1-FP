package com.company;

import java.util.Scanner;

public class Sesion1 {

    public static void main(String []args) {
        //Apartado 1

        System.out.println("1. Comprobar si un número es primo.");
        System.out.println("2. Escribir los n primeros números primos");
        System.out.println("3. Escribir la lista de los números primos gemelos comprendidos entre dos valores.");
        System.out.println("4. Mostrar todas las formas posibles de escribir un número par como suma de dos números primos");
        System.out.println("0. Finalizar la ejecución.");


        //Apartado 2

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la opción deseada:");
        int entradaMenu = teclado.nextInt();
        boolean opcionCorrecta = (entradaMenu <= 4)&&(entradaMenu >=0);

        if (opcionCorrecta) System.out.println("Ha elegido la opción " + entradaMenu);
        else System.out.println("Ha elegido una opción incorrecta");


        //Apartado 3

        System.out.print("Digite un número entero entre 0 y 1000:");
        int numero = teclado.nextInt();

        if ((numero >= 0)&&(numero <= 1000)) System.out.println("Tu número elegido es: " + numero);
        else System.out.println("Ha elegido un número incorrecto.");


        //Apartado 4

        System.out.print("\nAhora comprobaremos que para 2 números enteros, el primero es menor o igual que el segundo. ");
        System.out.println("Además, el segundo también debe ser divisible por el primero.");
        System.out.println("Introduce el primer número:");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número:");
        int numero2 = teclado.nextInt();

        int modulo = numero2 % numero1;
        boolean condicion1 = numero1 <= numero2;
        boolean condicion2 = modulo == 0;

        if (condicion1 && condicion2) System.out.println("Tu número es correcto.");
        else System.out.println("Tus números no cumple con las condiciones establecidas.");
    }
}
