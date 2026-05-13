package com.algoritmia.nivel01.recursion;

/**
 * SOLUCIÓN: Serie de Fibonacci.
 */
public class FibonacciSolucion {

    public int calcular(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        
        return calcular(n - 1) + calcular(n - 2);
    }
}
