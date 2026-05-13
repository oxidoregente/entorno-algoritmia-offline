package com.algoritmia.nivel01.recursion;

/**
 * SOLUCIÓN: Factorial Recursivo.
 * 
 * <p>Teoría:
 * La recursión divide un problema en subproblemas más pequeños.
 * 1. Caso Base: Si n es 0 o 1, el factorial es 1.
 * 2. Caso Recursivo: n! = n * (n-1)! </p>
 */
public class FactorialSolucion {

    public long calcular(int n) {
        if (n < 0) throw new IllegalArgumentException("Número debe ser >= 0");
        
        // Caso Base
        if (n <= 1) return 1;
        
        // Caso Recursivo
        return n * calcular(n - 1);
    }
}
