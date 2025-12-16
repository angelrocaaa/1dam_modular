package org.example;

import java.util.Scanner;

public class mediano_modular {
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
            clientes_actuales = procesarEvento(clientes, clientes_actuales, num_ticket);
        }

        System.out.println();
        return true;
    }

    // Método para los eventos que puede hacer un cliente puede ser atendido o puede llegar a la carniceria
    public static int procesarEvento(int[] clientes, int clientes_actuales, int num_ticket) {
        if (num_ticket == 0) {
            clientes_actuales = atenderCliente(clientes, clientes_actuales);
        } else {
            clientes_actuales = agregarCliente(clientes, clientes_actuales, num_ticket);
        }
        return clientes_actuales;
    }

    // Método para atender al cliente
    public static int atenderCliente(int[] clientes, int clientes_actuales) {
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
        return clientes_actuales;
    }

    // Método para agregar un cliente
    public static int agregarCliente(int[] clientes, int clientes_actuales, int num_ticket) {
        int pos = clientes_actuales;
        while (pos > 0 && clientes[pos - 1] > num_ticket) {
            clientes[pos] = clientes[pos - 1];
            pos--;
        }
        clientes[pos] = num_ticket;
        clientes_actuales++;
        return clientes_actuales;
    }
}
