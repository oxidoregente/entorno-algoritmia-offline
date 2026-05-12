package com.brandon.nivel01.arrays;

/**
 * SOLUCIÓN: Encontrar Duplicado.
 * 
 * <p>Teoría:
 * Al tener n+1 números en el rango [1,n], por el principio del palomar, 
 * debe haber al menos un duplicado. Al tratar los valores como índices, 
 * el duplicado crea un ciclo. Usamos el algoritmo de Floyd para encontrarlo.</p>
 */
public class EncontrarDuplicadoSolucion {

    public int buscar(int[] nums) {
        int tortuga = nums[0];
        int liebre = nums[0];
        
        // Fase 1: Encontrar la intersección en el ciclo
        do {
            tortuga = nums[tortuga];
            liebre = nums[nums[liebre]];
        } while (tortuga != liebre);
        
        // Fase 2: Encontrar la entrada al ciclo (el duplicado)
        tortuga = nums[0];
        while (tortuga != liebre) {
            tortuga = nums[tortuga];
            liebre = nums[liebre];
        }
        
        return liebre;
    }
}
