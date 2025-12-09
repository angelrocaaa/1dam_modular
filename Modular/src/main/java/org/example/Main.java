package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }

    public static int Funcion() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero...");
        int num = teclado.nextInt();
        return num*num*num;
    }

    public static boolean par (int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
