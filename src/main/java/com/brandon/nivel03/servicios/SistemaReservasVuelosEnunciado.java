package com.brandon.nivel03.servicios;

import org.springframework.stereotype.Service;
import java.util.Map;

/**
 * RETO: Sistema de Reservas de Vuelos.
 * 
 * Calcula el precio final de un ticket basándose en el destino y la clase.
 * 
 * Reglas:
 * 1. Destinos soportados: "MADRID" (500$), "PARIS" (600$), "LONDRES" (700$).
 * 2. Si el destino no está soportado, debe lanzar una IllegalArgumentException.
 * 3. Clase "EJECUTIVA": Incrementa el precio base en un 50%.
 * 4. Clase "TURISTA": Mantiene el precio base.
 * 5. Tasa Aeroportuaria: Añade un valor fijo de 45$ al final.
 */
@Service
public class SistemaReservasVuelosEnunciado {

    public double calcularPrecioTicket(String destino, String clase) {
        // TODO: Implementa la lógica de búsqueda de base y cálculo de extras
        return 0;
    }
}
