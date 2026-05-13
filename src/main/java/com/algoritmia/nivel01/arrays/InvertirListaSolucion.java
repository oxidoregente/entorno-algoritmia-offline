package com.algoritmia.nivel01.arrays;

import com.algoritmia.nivel01.arrays.InvertirListaEnunciado.Nodo;

/**
 * SOLUCIÓN: Invertir Lista Enlazada.
 * 
 * <p>Teoría:
 * Usamos tres punteros: anterior, actual y siguiente. En cada paso, guardamos
 * el siguiente nodo, apuntamos el actual hacia el anterior, y avanzamos.</p>
 */
public class InvertirListaSolucion {

    public Nodo invertir(Nodo cabeza) {
        Nodo anterior = null;
        Nodo actual = cabeza;
        
        while (actual != null) {
            Nodo siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        
        return anterior;
    }
}
