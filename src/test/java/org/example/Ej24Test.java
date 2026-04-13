package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import ucu.edu.aed.tda.Conjunto;

public class Ej24Test {
    
    
    @Test
    public void testAgregar(){
        Conjunto<Integer> conjunto = new Conjunto<>();

        assertTrue(conjunto.esVacio());

        conjunto.agregar(1);
        conjunto.agregar(2);
        conjunto.agregar(3);

        assertFalse(conjunto.esVacio());
        assertTrue(conjunto.contiene(1));
        assertTrue(conjunto.contiene(2));
        assertTrue(conjunto.contiene(3));
    }

    @Test
    public void testUnion(){
        Conjunto<Integer> conjunto1 = new Conjunto<>();
        Conjunto<Integer> conjunto2 = new Conjunto<>();

        conjunto1.agregar(1);
        conjunto1.agregar(2);
        conjunto1.agregar(3);

        conjunto2.agregar(2);
        conjunto2.agregar(3);
        conjunto2.agregar(4);

        Conjunto<Integer> union = (Conjunto<Integer>) conjunto1.union(conjunto2);

        assertTrue(union.contiene(1));
        assertTrue(union.contiene(2));
        assertTrue(union.contiene(3));
        assertTrue(union.contiene(4));
    }


    @Test
    public void testInterseccion(){
        Conjunto<Integer> conjunto1 = new Conjunto<>();
        Conjunto<Integer> conjunto2 = new Conjunto<>();

        conjunto1.agregar(1);
        conjunto1.agregar(2);
        conjunto1.agregar(3);

        conjunto2.agregar(2);
        conjunto2.agregar(3);
        conjunto2.agregar(4);

        Conjunto<Integer> interseccion = (Conjunto<Integer>) conjunto1.interseccion(conjunto2);

        assertTrue(interseccion.contiene(2));
        assertTrue(interseccion.contiene(3));
        assertFalse(interseccion.contiene(1));
        assertFalse(interseccion.contiene(4));
    }

    @Test
    public void testDiferencia(){
        Conjunto<Integer> conjunto1 = new Conjunto<>();
        Conjunto<Integer> conjunto2 = new Conjunto<>();

        conjunto1.agregar(1);
        conjunto1.agregar(2);
        conjunto1.agregar(3);

        conjunto2.agregar(2);
        conjunto2.agregar(3);
        conjunto2.agregar(4);

        Conjunto<Integer> diferencia = (Conjunto<Integer>) conjunto1.diferencia(conjunto2);

        assertTrue(diferencia.contiene(1));
        assertFalse(diferencia.contiene(2));
        assertFalse(diferencia.contiene(3));
        assertFalse(diferencia.contiene(4));
    }

    @Test
    public void testEsSubconjuntoDe(){
        Conjunto<Integer> conjunto1 = new Conjunto<>();
        Conjunto<Integer> conjunto2 = new Conjunto<>();

        conjunto1.agregar(1);
        conjunto1.agregar(2);

        conjunto2.agregar(1);
        conjunto2.agregar(2);
        conjunto2.agregar(3);

        assertTrue(conjunto1.esSubconjuntoDe(conjunto2));
        assertFalse(conjunto2.esSubconjuntoDe(conjunto1));
    }

    


    
}
