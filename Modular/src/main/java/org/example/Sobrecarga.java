package org.example;

public class Sobrecarga {

    public static void atacar() {
        System.out.println("ATACANDO");
    }

    public static int atacar(String nomnbre) {
        System.out.println("Te esta atacando " + nomnbre);
        return 0;
    }

    public static void atacar(int nivel) {
        System.out.println("ATACANDO CON NIVEL " + nivel);
    }

    public static void main(String[] args) {
        atacar();
    }
}
