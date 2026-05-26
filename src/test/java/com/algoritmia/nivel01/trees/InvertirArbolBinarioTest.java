package com.algoritmia.nivel01.trees;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel01.trees.InvertirArbolBinarioEnunciado.TreeNode;

/**
 * Test para ejercicio de Invertir Árbol Binario.
 * Valida inversión de nodos левый/derecho en árbol binario.
 */
class InvertirArbolBinarioTest {

    @Test
    void testInvertirArbolSimple() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        InvertirArbolBinarioEnunciado solver = new InvertirArbolBinarioEnunciado();
        TreeNode invertido = solver.invertir(root);

        // Debería fallar hasta que se implemente
        assertNotNull(invertido);
        assertEquals(7, invertido.left.val);
        assertEquals(2, invertido.right.val);
    }
}
