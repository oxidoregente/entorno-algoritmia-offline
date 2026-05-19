package com.algoritmia.nivel01.arrays;

/**
 * 🎓 RETO: Invertir Lista Enlazada.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un algoritmo para invertir una lista enlazada simple. La inversión debe
 * hacerse in-place, modificando los punteros `siguiente` de cada nodo.</p>
 *
 * <h3>Estructura del Nodo:</h3>
 * <pre>
 * public static class Nodo {
 *     public int valor;
 *     public Nodo siguiente;
 * }
 * </pre>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:  1 -> 2 -> 3 -> null
 * Salida:   3 -> 2 -> 1 -> null
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Necesitarás tres punteros: `anterior`, `actual` y `siguiente`.</li>
 *   <li>En cada paso, guarda el siguiente nodo, invierte el puntero del nodo actual hacia atrás,
 *       y avanza los punteros.</li>
 *   <li>Al final, el nodo `anterior` se convierte en la nueva cabeza.</li>
 * </ul>
 */
public class InvertirListaEnunciado {

    public static class Nodo {
        public int valor;
        public Nodo siguiente;
        public Nodo(int valor) { this.valor = valor; }
    }

    /**
     * Invierte una lista enlazada simple de forma iterativa.
     *
     * @param cabeza El nodo cabeza de la lista a invertir. Puede ser null.
     * @return El nuevo nodo cabeza de la lista invertida, o null si la lista está vacía.
     */
    public Nodo invertir(Nodo cabeza) {
        // TODO: Implementa la inversión de punteros
        return null;
    }
}
