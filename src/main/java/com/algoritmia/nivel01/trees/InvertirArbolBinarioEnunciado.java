package com.algoritmia.nivel01.trees;

/**
 * 🎓 RETO: Invertir Árbol Binario.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Dada la raíz de un árbol binario, invierte el árbol intercambiando el hijo
 * izquierdo con el hijo derecho de cada nodo, de forma recursiva, y devuelve la raíz
 * del árbol resultante.</p>
 *
 * <p>Este problema es conocido popularmente por una anécdota de Google donde
 * el 50% de los candidatos no pudieron resolverlo.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Árbol original:
 *     4
 *    / \
 *   2   7
 *  / \ / \
 * 1  3 6  9
 *
 * Árbol invertido:
 *     4
 *    / \
 *   7   2
 *  / \ / \
 * 9  6 3  1
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa recursión: para cada nodo, intercambia los hijos izquierdo y derecho.</li>
 *   <li>Luego invierte recursivamente el subárbol izquierdo y el subárbol derecho.</li>
 *   <li>El caso base es cuando el nodo es null.</li>
 * </ul>
 */
public class InvertirArbolBinarioEnunciado {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) { this.val = val; }
    }

    /**
     * Invierte un árbol binario intercambiando los hijos de cada nodo recursivamente.
     *
     * @param root La raíz del árbol binario a invertir.
     * @return La raíz del árbol invertido.
     */
    public TreeNode invertir(TreeNode root) {
        // TODO: Implementa la inversión recursiva del árbol
        return null;
    }
}
