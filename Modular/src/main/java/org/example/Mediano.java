package org.example;

import java.util.Arrays;
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
            int num_eventos = teclado.nextInt();
            int eventos_ceros[] = new int[num_eventos];
            int contador = 0;

            for (int i = 0; i < eventos_ceros.length; i++) {
                eventos_ceros[i] = teclado.nextInt();

                if (eventos_ceros[i] == 0) {
                    int mediana = (i + 1) / 2;
                    int cliente = eventos_ceros[mediana];
                    System.out.print(cliente + " ");
                }
            }

            return true;
        }
    } // casoDePrueba
}
