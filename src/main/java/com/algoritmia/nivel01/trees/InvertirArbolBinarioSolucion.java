package com.algoritmia.nivel01.trees;

import com.algoritmia.nivel01.trees.InvertirArbolBinarioEnunciado.TreeNode;

/**
 * SOLUCIÓN: Invertir Árbol Binario.
 * 
 * <p>Usa un enfoque recursivo que intercambia los hijos izquierdo y
 * derecho de cada nodo, recorriendo el árbol en profundidad.</p>
 */
public class InvertirArbolBinarioSolucion {

    /**
     * Invierte un árbol binario intercambiando recursivamente los hijos
     * de cada nodo.
     *
     * @param root la raíz del árbol a invertir
     * @return la nueva raíz del árbol invertido
     */
    public TreeNode invertir(TreeNode root) {
        if (root == null) return null;

        // Guardamos los hijos antes de intercambiar
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Intercambiamos
        root.left = invertir(right);
        root.right = invertir(left);

        return root;
    }
}
