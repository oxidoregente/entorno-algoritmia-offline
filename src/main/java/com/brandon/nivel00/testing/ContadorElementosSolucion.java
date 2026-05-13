package com.brandon.nivel00.testing;

import java.util.List;

/**
 * Nivel 00: Testing Inverso.
 */
public class ContadorElementosSolucion {

    /**
     * Cuenta cuántos elementos no nulos hay en la lista.
     */
    public int contarNoNulos(List<String> lista) {
        if (lista == null) return 0;
        int count = 0;
        for (String s : lista) {
            if (s != null) count++;
        }
        return count;
    }
}
