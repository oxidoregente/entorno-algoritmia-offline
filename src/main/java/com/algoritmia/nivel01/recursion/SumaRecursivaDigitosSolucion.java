package com.algoritmia.nivel01.recursion;

/**
 * SOLUCIÓN: Suma Recursiva de Dígitos.
 */
public class SumaRecursivaDigitosSolucion {

    public int sumar(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumar(n / 10);
    }
}
