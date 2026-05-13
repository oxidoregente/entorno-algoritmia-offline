package com.algoritmia.nivel01.trees;

import com.algoritmia.nivel01.trees.InvertirArbolBinarioEnunciado.TreeNode;

/**
 * SOLUCIÓN: Invertir Árbol Binario.
 */
public class InvertirArbolBinarioSolucion {

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
