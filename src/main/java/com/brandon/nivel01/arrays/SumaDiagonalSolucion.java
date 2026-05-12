package com.brandon.nivel01.arrays;

/**
 * SOLUCIÓN: Suma de la Diagonal Principal.
 */
public class SumaDiagonalSolucion {

    public int sumar(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
}
