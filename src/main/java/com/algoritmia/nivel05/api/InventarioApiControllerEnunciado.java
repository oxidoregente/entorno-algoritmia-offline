package com.algoritmia.nivel05.api;

import com.algoritmia.nivel04.repositorios.ItemEnunciado;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 🎓 RETO: Controlador de Inventario (POST).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Implementa un endpoint POST que reciba un JSON con los datos de un `ItemEnunciado`
 * y simule su creación, devolviendo un mensaje de confirmación.</p>
 *
 * <h3>Endpoint:</h3>
 * <p><code>POST /api/v1/items</code></p>
 * <p><b>Body (JSON):</b> {"nombre": "Laptop", "stock": 10, "categoria": "Electrónica"}</p>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa @PostMapping y @RequestBody para recibir el JSON.</li>
 *   <li>Devuelve un String con un mensaje como "Item creado: Laptop".</li>
 * </ul>
 */
@RestController
@RequestMapping("/api/v1/items")
public class InventarioApiControllerEnunciado {

    /**
     * Crea un nuevo item de inventario a partir de un JSON.
     *
     * @param item Los datos del item a crear (en formato JSON).
     * @return Mensaje de confirmación con el nombre del item.
     */
    // TODO: Define el @PostMapping con @RequestBody
    public String crearItem(ItemEnunciado item) {
        return null;
    }
}
