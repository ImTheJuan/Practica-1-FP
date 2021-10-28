/* PARA LOS METODOS RECUSRSIVOS ES NECESARIO:
    1. PASO BASE
    2. LLAMADA RECURSIVA
    3. CONDICION DE FINALIZACION
*/

package com.company;

import java.util.Scanner;

public class Sesion4 {

    static Scanner teclado = new Scanner(System.in);

    //Apartado 1
    static void primosGemelos(int numero1, int numero2){

        //int contador = numero1;
        int contadorMenu = 1;
        int primerPrimo = 2;
        int segundoPrimo = 0;

        for (int i=numero1; i < numero2; i++) {
            if (Sesion2.esPrimo(i)) {
                segundoPrimo = i;
                if (primerPrimo + 2 == segundoPrimo) {
                    System.out.printf("%2d. %5d %5d\n", contadorMenu, primerPrimo, segundoPrimo);
                    primerPrimo = segundoPrimo;
                    segundoPrimo = 0;
                    contadorMenu++;
                }
            }
            if (segundoPrimo != 0) {
                primerPrimo = segundoPrimo;
                segundoPrimo = 0;
            }
        }
    }

    //Apartado 2
    static void mostrarSumasDePrimos(int num){
        int contadorMenu = 1;
        for (int i=2; i<num; i++){
            if(Sesion2.esPrimo(i) && Sesion2.esPrimo(num-i)) {
                int num2 = num-i;
                System.out.printf("%d. %s\n", contadorMenu, i + " + " + num2 + " = " + num);
                contadorMenu++;
            }
        }
    }

    //Apartado 3
    static boolean esPrimoRecursivo(int numero, int contador){
        if (numero == 1) return false;
        if (contador>=numero) return true;
        else if (numero%contador == 0) return false;
        else return esPrimoRecursivo(numero, contador+1);
    }

    //Apartado 4
    static double potencia(int numero1, int numero2){
        double resultado;
        if (numero2 == 0) return 1;
        else if (numero2 == 1) return numero1;
        else return (numero1 * potencia(numero1, (numero2)-1));
    }
}
