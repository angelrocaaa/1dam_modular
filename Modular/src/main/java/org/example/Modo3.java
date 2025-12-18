package org.example;

import java.util.Scanner;

public class Modo3 {

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
            int num_trenes = teclado.nextInt();
            int convoys[] = new int[num_trenes];
            int contador = 0;

            for (int i = 0; i < convoys.length; i++) {
                convoys[i] = teclado.nextInt();
                for (int j = 0; j < convoys.length; j++) {
                    if (i != convoys.length - 1) {
                        if (convoys[j] > convoys[j +1]) {
                            convoys[j +1] = convoys[j +1] -1;
                            contador++;
                            System.out.println(contador);
                        }
                    }
                }
            }
            return true;
        }
    } // casoDePrueba
}
