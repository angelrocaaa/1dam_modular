package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Bateria_Ejercicio4_Metodos {
    public static void main(String[] args) {
        double vector[] = introducirRecaudacion();
        System.out.println(Arrays.toString(vector));

        System.out.println(diaMaximo(vector));
        System.out.println(diaMinimo(vector));

        double media = media(vector);
        System.out.println(media);

        double domingo = domingo(vector);
        System.out.println(domingo);

        if (domingo > media) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static double[] introducirRecaudacion () {
        Scanner teclado = new Scanner(System.in);

        double vector[] = new double[6];

        System.out.println("Introduce el valor para cada día...");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextDouble();
        }

        return vector;
    }

    public static String diaMaximo (double vector[]) {
        double ventas_max = vector[0];
        int dia = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > ventas_max) {
                ventas_max=vector[i];
                dia = i;
            }
        }

        return dia_Semana(dia);
    }

    public static String dia_Semana (int dia) {
        switch (dia) {
            case 0:
                return "Martes";
            case 1:
                return "Miercoles";
            case 2:
                return "Jueves";
            case 3:
                return "Viernes";
            case 4:
                return "Sábado";
            case 5:
                return "Domingo";
        }
        return "";
    }

    public static String diaMinimo (double vector[]) {
        double ventas_max = vector[0];
        int dia = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < ventas_max) {
                ventas_max=vector[i];
                dia = i;
            }
        }

        return dia_Semana(dia);
    }

    public static double media (double vector[]) {
        double suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }

        return (suma/ vector.length);
    }

    public static double domingo (double vector[]) {
        return vector[vector.length-1];
    }
}
