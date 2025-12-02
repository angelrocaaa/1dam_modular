package org.example;

import java.util.Scanner;

public class Bateria_Ejercicio2_Metodos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        imprimir_menu();

        System.out.println("Elige una opción:");
        char opcion = teclado.next().charAt(0);

        validarOpcion(opcion);

        if (validarOpcion(opcion)) {
            System.out.println("Válido");
        } else {
            System.out.println("No es válido");
        }

    }

    public static void imprimir_menu() {
        System.out.println("Bienvenido!!");
        System.out.println("1. Cantar");
        System.out.println("2. Bailar");
        System.out.println("3. Hacer backflip");
        System.out.println("X. Salir");

    }

    public static boolean validarOpcion(char opcion) {

        switch (opcion) {
            case '1':
            case '2':
            case '3':
            case 'X':
                return true;
            default:
                return false;
        }
    }
}
