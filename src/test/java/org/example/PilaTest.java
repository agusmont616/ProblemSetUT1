package org.example;

import junit.framework.TestCase;
import ucu.edu.aed.tda.Pila;

public class PilaTest
extends TestCase {
    
    public void testPila() {
        Pila<Integer> pila = new Pila<>();

        assertTrue(pila.esVacio());

        pila.mete(1);
        pila.mete(2);
        pila.mete(3);

        assertFalse(pila.esVacio());
        assertEquals(3, (int) pila.tope());

        assertEquals(3, (int) pila.saca());
        assertEquals(2, (int) pila.tope());

        pila.mete(4);
        assertEquals(4, (int) pila.tope());

        assertEquals(4, (int) pila.saca());
        assertEquals(2, (int) pila.saca());
        assertEquals(1, (int) pila.saca());

        assertTrue(pila.esVacio());
    }
}
