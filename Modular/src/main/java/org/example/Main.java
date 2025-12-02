package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 10;
        int numero = Funcion(num);
        System.out.println(numero);
        procedimiento();
        System.out.println("He vuelto del procedimiento");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        pintar_nombre("patri","kevin","david");

    }

    public static int Funcion(int numero) {

        numero = numero+20;
        return numero * 10;
    }

    public static void procedimiento() {
        System.out.println("Hola soy un procedimiento y hago mis cosas");
    }

    public static void pintar_nombre(String...nombre) {
        for (String num : nombre) {
            System.out.println(num);
        }
    }
}
