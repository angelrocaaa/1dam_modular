package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void funcion() {
//
//        assertAll(
//                () -> assertEquals(2,Main.Funcion(2)),
//                () -> assertEquals(30,Main.Funcion(3))
//        );

        String entradaSimulada = "2";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));


        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

//        Prueba de el cubo de los numeros que le pasamos
        assertEquals(8,Main.Funcion());

        String salidaEsperada = "Introduce un numero...";
        assertTrue(salida.toString().contains(salidaEsperada));

//        assertEquals(30,Main.Funcion());
//      Prueba de si el boleano es true o false para ver si es par el numero que le pasamos
//        assertFalse(Main.par(3));
//        assertTrue(Main.par(10));

    }
}