

/* PARA LOS METODOS RECUSRSIVOS ES NECESARIO:
    1. PASO BASE
    2. LLAMADA RECURSIVA
    3. CONDICION DE FINALIZACION
*/

package com.company;

import java.util.Scanner;

public class Sesion4 {

    static Scanner teclado = new Scanner(System.in);

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

    //Apartado 1
    static void primosGemelos(int numero1, int numero2){

        int contador = numero1;
        int contadorMenu = 1;
        int primerPrimo = 0;
        int segundoPrimo = 0;

        while (contador < numero2) {
            for (int i=0; i<2;) {
                if (esPrimo(contador)) {
                    if (primerPrimo == 0) primerPrimo = contador;
                    else segundoPrimo = contador;
                    if (primerPrimo + 2 == segundoPrimo) {
                        System.out.printf("%2d. %5d %5d\n", contadorMenu, primerPrimo, segundoPrimo);
                        primerPrimo = segundoPrimo;
                        segundoPrimo = 0;
                        contadorMenu++;
                    }
                    i++;
                }
                contador++;
            }
            primerPrimo = segundoPrimo;
            segundoPrimo = 0;
        }
    }

    //Apartado 2
    static void mostrarSumasDePrimos(){
        int num = Sesion3.leerNumero(4, 1000);
        int contadorMenu = 1;
        for (int i=2; i<num; i++){
            if(esPrimo(i) && esPrimo(num-i)) {
                int num2 = num-i;
                System.out.printf("%d. %s\n", contadorMenu, i + " + " + num2 + " = " + num);
                contadorMenu++;
            }
        }
    }

    //Apartado 3



    public static void main(String []args){

        System.out.println("Introduzca un número comprendido entre 1 y 500");
        int numero1 = teclado.nextInt();
        System.out.println("Introduzca otro número comprendido entre 1 y 500");
        int numero2 = teclado.nextInt();
        primosGemelos(numero1, numero2);

        System.out.println("Mostrar sumas de primos");
        mostrarSumasDePrimos();
    }
}
