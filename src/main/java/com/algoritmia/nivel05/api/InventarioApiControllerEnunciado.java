package com.algoritmia.nivel05.api;

import com.algoritmia.nivel04.repositorios.ItemEnunciado;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 🎓 RETO: Controlador de Inventario (POST).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Implementa un endpoint POST "/api/v1/items" que reciba un JSON con los 
 * datos de un ItemEnunciado y simule su creación devolviendo el objeto con un mensaje.</p>
 */
@RestController
@RequestMapping("/api/v1/items")
public class InventarioApiControllerEnunciado {

    // TODO: Define el @PostMapping con @RequestBody
    public String crearItem(ItemEnunciado item) {
        return null;
    }
}
