package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class atasco_vias {
    static Scanner teclado = new Scanner(System.in);;

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
            teclado.nextLine();

            for (int j = 0; j < convoys.length; j++) {
                convoys[j] = teclado.nextInt();
                if (j != convoys.length - 1) {
                    if (convoys[j] > convoys[j +1]) {
                        convoys[j] = convoys[j] - 1;
                        contador++;
                    }
                }
            }
            System.out.println(contador);

            return true;
        }
    } // casoDePrueba
}
