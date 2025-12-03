package org.example;

import java.util.Scanner;

public class Bateria_Ejercicio3_Metodos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena...");
        String cadena = teclado.nextLine();
        String resultado = imprimirCadena(cadena);

        System.out.println(imprimirCadena(cadena));
        System.out.println(contarVocales(imprimirCadena(cadena)));

    }

    public static String imprimirCadena (String cadena) {
        String resultado = cadena.toUpperCase();
        return resultado;
    }
    public static int contarVocales (String resultado) {
        int contador = 0;
        for (int i = 0; i < resultado.length(); i++) {
            if (resultado.charAt(i) == 'A' || resultado.charAt(i) == 'E' || resultado.charAt(i) == 'I' || resultado.charAt(i) == 'O' || resultado.charAt(i) == 'U' ) {
                contador++;
            }
        }
        return contador;
    }
}
