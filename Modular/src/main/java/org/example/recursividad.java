package org.example;
import java.util.Scanner;

public class recursividad {
    static Scanner teclado = new Scanner(System.in);


    public static void main() {
        menu_opciones();


    }

    public static void menu_opciones(){
        System.out.println("*** Bateria de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuacion el modo que quieras ejecutar...");
        System.out.println("1 - Digitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Reves");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabetico");
        System.out.println("7 - Mostrar sumas");
        System.out.println();
        System.out.print("Opcion:");

        int opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Inroduce un numero");
                int numeros= teclado.nextInt();
                System.out.println(ejercicio1(numeros));
                break;
            case 2:
                System.out.println("Introduce el numero");
                int numero=teclado.nextInt();
                System.out.println("Introduce el exponente");
                int exponente= teclado.nextInt();
                System.out.println(ejercicio2(numero,exponente));
                break;
            case 3:
                System.out.println("Quieres invertir un número (n) o una cadena (c)?");
                char respuesta=teclado.next().charAt(0);
                if (respuesta=='c') {
                    System.out.println("Introduce una frase");
                    char[] cadena = teclado.next().toCharArray();
                    ejercicio3_2(cadena.length-1,cadena);
                }else if (respuesta=='n'){
                    System.out.println("Introduce el numero");
                    int numero2=teclado.nextInt();
                    ejercicio3(numero2);
                }
                break;
            case 4:
                System.out.println("Introduce un numero...");
                int binario = teclado.nextInt();
                System.out.println(ejercicio4(binario));
                break;
            case 5:
                System.out.println("Introduce un numero...");
                int parametro = teclado.nextInt();
                String binario_pasado = ejercicio5(parametro);
                System.out.println(binario_pasado);
                break;
            case 6:
                System.out.println("Introduce una palabra");
                String palabra= teclado.next();
                ejercicio6(palabra);
                break;
            case 7:
                System.out.println("Introduce un numero");
                int numero3= teclado.nextInt();
                System.out.println(ejercicio7(numero3));
                break;
            }

            teclado.nextLine();

            System.out.println();
            System.out.println("Elige una opcion:");
            System.out.println("[M] - Volver al menú principal");
            System.out.println("[X] - Salir");


            String resultado = teclado.nextLine();
            String resultado_mayusculas = resultado.toUpperCase();
            switch (resultado_mayusculas){
                case "M":
                    System.out.println();
                    menu_opciones();
                    break;
            }

        }

  public static int ejercicio1(int numero){
        if (numero < 10){
            return 1;
        }else{
            return 1+ejercicio1(numero/10);
        }
  }

  public static int ejercicio2(int numero, int exponente){
        if (exponente==1){
            return numero;
        }else {
            return numero*ejercicio2(numero,exponente-1);
        }
  }

  public static void ejercicio3(int numero2){
        if (numero2 < 10){
            System.out.println(numero2);;
        }else{
            System.out.println(numero2%10);
            ejercicio3(numero2/10);
        }
  }

  public static void ejercicio3_2(int posicion, char[] cadena){
        if (posicion>=0){
            System.out.print(cadena[posicion]);
            ejercicio3_2(posicion-1, cadena);
        }
  }


   public static boolean ejercicio4(int binario) {
        if (binario >= 10) {
            if (binario % 10 == 0) {
                return ejercicio4(binario / 10);
            } else {
                return false;
            }
        } else{
            if (binario == 0 || binario == 1) {
                return true;
            } else {
                return false;
            }
        }
   }

   public static String ejercicio5(int parametro){
        if (parametro <=1){
            return Integer.toString(parametro);
        }else{
            return ejercicio5(parametro /2)+ parametro %2;
        }
   }

    public static boolean ejercicio6(String palabra) {
        if (palabra.length() <= 1) {
            return true;
        }
        if (palabra.charAt(0) > palabra.charAt(1)) {
            return false;
        }
        return ejercicio6(palabra.substring(1));
    }


    public static int ejercicio7(int numero3){
        if (numero3 ==1){
            return numero3;
        }else{
            return numero3 + ejercicio7(numero3 -1);
        }
    }
}
