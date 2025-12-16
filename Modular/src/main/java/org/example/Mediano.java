package org.example;

import java.util.Scanner;

public class Mediano {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        if (!teclado.hasNextInt())
            return false;

        int num_eventos = teclado.nextInt();
        int[] clientes = new int[num_eventos];
        int clientes_actuales = 0;

        for (int i = 0; i < num_eventos; i++) {
            int num_ticket = teclado.nextInt();
            System.out.println(clientes_actuales);

            if (num_ticket == 0) {
                if (clientes_actuales == 0) {
                    System.out.print("ECSA ");
                } else {
                    int mediana = (clientes_actuales - 1) / 2;
                    System.out.print(clientes[mediana] + " ");

                    for (int j = mediana; j < clientes_actuales - 1; j++) {
                        clientes[j] = clientes[j + 1];
                    }
                    clientes_actuales--;
                }
            } else {
                int pos = clientes_actuales;
                while (pos > 0 && clientes[pos - 1] > num_ticket) {
                    clientes[pos] = clientes[pos - 1];
                    pos--;
                }
                clientes[pos] = num_ticket;
                clientes_actuales++;
            }
        }

        System.out.println();
        return true;
    }
}
