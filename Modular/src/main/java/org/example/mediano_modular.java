package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Angel
 * @version 1.0
 */

public class mediano_modular {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {
        }
    }

    /**
     * @author dam1
     * @version 1.0
     * @return Devuelve un true si el casoDePrueba ha funcionado correctamente
     */
    public static boolean casoDePrueba() {
        //Declaramos las variables
        boolean control = true;
        int num_eventos = 0;
        int[] clientes;
        int clientes_actuales = 0;
        System.out.println("*****CARNICERIA JOAQUIN*****");

        // Do while por si el numero de eventos es menor que 0 entonces que lo vuelva a preguntar
        do {
            System.out.println("Introduce el número de clientes de la carniceria...");
            if (!teclado.hasNextInt())
                return false;
            num_eventos = teclado.nextInt();
            if (num_eventos > 0) {
                control = false;
            }
        } while (control == true);

        // Le damos tamaño vector
        clientes = new int[num_eventos];

        System.out.println("Introduce el número del ticket de cada cliente y introduce 0 cuando el carninecero pregunte... ");
        // Para pasarle números por la entrada y después trabajar con ellos
        for (int i = 0; i < num_eventos; i++) {
            int num_ticket = 0;
            try {
                num_ticket = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Formato introducido incorrecto");
                break;
            }

            // Condición para que si introducen un ticket negativo tengas que volver a introducir otro
            if (num_ticket < 0) {
                System.out.println("No hay tickets negativos. Introduce de nuevo el número del ticket de cada cliente e introduce 0 cuando el carninecero pregunte... ");
                i--;
                continue;
            }

            // Condición para que no hayan más clientes de los que asisten
            if (num_ticket != 0 && clientes_actuales >= clientes.length) {
                System.out.println("ERROR: Se han introducido más clientes que el número de eventos.");
                return false;
            }

            clientes_actuales = procesarEvento(clientes, clientes_actuales, num_ticket);
        }

        System.out.println(", Son los clientes atendidos");
        System.out.println();
        return true;
    }
    /**
     * @author Angel
     * @version 1.0
     * @return Devuelve un numero entero que es para saber el cliente actual
     */

    // Método para los eventos que puede hacer un cliente puede ser atendido o puede llegar a la carniceria
    public static int procesarEvento(int[] clientes, int clientes_actuales, int num_ticket) {
        if (num_ticket == 0) {
            clientes_actuales = atenderCliente(clientes, clientes_actuales);
        } else {
            clientes_actuales = agregarCliente(clientes, clientes_actuales, num_ticket);
        }
        return clientes_actuales;
    }

    /**
     * @author Angel
     * @version 1.0
     * @return Devuelve un numero entero que es la mediana ya que se ha tenido que calcular o un ECSA también.
     */
    // Método para atender al cliente
    public static int atenderCliente(int[] clientes, int clientes_actuales) {
        // Si la cantidad de clientes actuales es 0 el carnicero se aburrirá si no es 0 entonces calculará la mediana
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
        System.out.println();
        return clientes_actuales;
    }
    /**
     * @author Angel
     * @version 1.0
     * @return Devuelve un numero entero que es el número que tendremos que añadir al vector ya que ha venido a nuestra Carniceria
     */
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
