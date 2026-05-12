package com.brandon.nivel1.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.brandon.nivel1.arrays.InvertirListaEnunciado.Nodo;

class InvertirListaTest {

    @Test
    void testInvertirLista() {
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);
        n1.siguiente = n2;
        n2.siguiente = n3;

        InvertirListaEnunciado solver = new InvertirListaEnunciado();
        Nodo nuevaCabeza = solver.invertir(n1);

        // assertNotNull(nuevaCabeza);
        // assertEquals(3, nuevaCabeza.valor);
        // assertEquals(2, nuevaCabeza.siguiente.valor);
    }
}
