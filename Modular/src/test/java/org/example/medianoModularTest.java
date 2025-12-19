package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class medianoModularTest {

    @Test
    void agregarCliente() {
        int[] clientes = new int[5];
        int clientes_actuales = 0;

        clientes_actuales = mediano_modular.agregarCliente(clientes, clientes_actuales, 10);
        clientes_actuales = mediano_modular.agregarCliente(clientes, clientes_actuales, 5);
        clientes_actuales = mediano_modular.agregarCliente(clientes, clientes_actuales, 7);

        assertEquals(3, clientes_actuales);
        assertArrayEquals(new int[]{5, 7, 10, 0, 0}, clientes);
    }

    @Test
    void atenderClienteConClientes() {
        int[] clientes = {2, 5, 8, 0, 0};
        int clientes_actuales = 3;

        clientes_actuales = mediano_modular.atenderCliente(clientes, clientes_actuales);

        assertEquals(2, clientes_actuales);
        assertArrayEquals(new int[]{2, 8, 8, 0, 0}, clientes);
    }

    @Test
    void atenderClienteSinClientes() {
        int[] clientes = new int[3];
        int clientes_actuales = 0;

        clientes_actuales = mediano_modular.atenderCliente(clientes, clientes_actuales);

        assertEquals(0, clientes_actuales);
    }

    @Test
    void procesarEventoAgregarCliente() {
        int[] clientes = new int[4];
        int clientes_actuales = 0;

        clientes_actuales = mediano_modular.procesarEvento(clientes, clientes_actuales, 4);

        assertEquals(1, clientes_actuales);
        assertArrayEquals(new int[]{4, 0, 0, 0}, clientes);
    }

    @Test
    void testProcesarEventoAtenderCliente() {
        int[] clientes = {3, 6, 9, 0};
        int clientes_actuales = 3;

        clientes_actuales = mediano_modular.procesarEvento(clientes, clientes_actuales, 0);

        assertEquals(2, clientes_actuales);
        assertArrayEquals(new int[]{3, 9, 9, 0}, clientes);
    }

}
