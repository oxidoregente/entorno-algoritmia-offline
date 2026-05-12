package com.brandon.nivel1.arrays;

/**
 * SOLUCIÓN: Número Faltante.
 * 
 * <p>Teoría (Fórmula de Gauss):
 * La suma de los primeros 'n' números es n*(n+1)/2. Si sumamos todos los elementos
 * del array y lo restamos de la suma teórica, el resultado es el número que falta.</p>
 */
public class NumeroFaltanteSolucion {

    public int encontrarFaltante(int[] nums) {
        int n = nums.length;
        int sumaTeorica = n * (n + 1) / 2;
        int sumaReal = 0;
        
        for (int num : nums) {
            sumaReal += num;
        }
        
        return sumaTeorica - sumaReal;
    }
}
