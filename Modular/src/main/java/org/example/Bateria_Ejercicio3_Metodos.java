package org.example;

import java.util.Scanner;

public class Bateria_Ejercicio3_Metodos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena...");
        String cadena = teclado.next();

    }

    public static String imprimirCadena (String cadena) {
        return cadena.toUpperCase();
    }
}
