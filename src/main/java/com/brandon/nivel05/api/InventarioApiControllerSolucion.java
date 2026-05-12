package com.brandon.nivel05.api;

import com.brandon.nivel04.repositorios.ItemEnunciado;
import org.springframework.web.bind.annotation.*;

/**
 * 🏆 SOLUCIÓN: Controlador de Inventario.
 */
public class InventarioApiControllerSolucion {

    @PostMapping
    public String crearItem(@RequestBody ItemEnunciado item) {
        return "Item '" + item.getNombre() + "' creado con éxito en la categoría " + item.getCategoria();
    }
}
