package org.example;

import java.util.Scanner;

public class Mediano {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            int eventos = teclado.nextInt();
            int vector[] = new int[eventos];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = teclado.nextInt();
                if (vector[i] == 0) {

                }
            }
            return true;
        }
    } // casoDePrueba

}
