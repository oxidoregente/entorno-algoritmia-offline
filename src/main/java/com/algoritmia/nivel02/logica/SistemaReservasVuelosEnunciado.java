package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Sistema de Reservas de Vuelos. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Calcula el precio final de un ticket de avión basándose en el destino y la
 * clase seleccionada.
 * </p>
 *
 * <p>
 * <b>Destinos soportados y precios base:</b>
 * </p>
 * <ul>
 * <li>"MADRID" -> $500</li>
 * <li>"PARIS" -> $600</li>
 * <li>"LONDRES" -> $700</li>
 * </ul>
 *
 * <p>
 * <b>Reglas:</b>
 * </p>
 * <ol>
 * <li>Si el destino no está soportado, lanza una
 * `IllegalArgumentException`.</li>
 * <li>Clase "EJECUTIVA": incrementa el precio base en un 50%.</li>
 * <li>Clase "TURISTA": mantiene el precio base.</li>
 * <li>Al final, añade una tasa aeroportuaria fija de $45.</li>
 * </ol>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * destino="PARIS", clase="EJECUTIVA"
 * Precio base: 600
 * Incremento: 600 * 0.5 = 300
 * Tasa: 45
 * Total: 945
 * </pre>
 */
@Service
public class SistemaReservasVuelosEnunciado {

    /**
     * Calcula el precio final de un ticket según destino y clase.
     *
     * @param destino El destino del vuelo (MADRID, PARIS, LONDRES).
     * @param clase   La clase del ticket (TURISTA, EJECUTIVA).
     * @return El precio final del ticket.
     * @throws IllegalArgumentException Si el destino no está soportado.
     */
    public double calcularPrecioTicket(String destino, String clase) {
        // TODO: Implementa la lógica de cálculo del ticket

        double precio = 0.0;

        switch (destino.toLowerCase()) {
        case "madrid":
            precio = 500.0;
            break;

        case "paris":
            precio = 600.0;
            break;

        case "londres":
            precio = 700.0;
            break;

        default:
            throw new IllegalArgumentException("Destino no encontrado");
        }

        switch (clase.toLowerCase()) {
        case "ejecutiva":
            precio *= 1.5;
            break;
        default:
            throw new IllegalArgumentException("Clase no encontrada");
        }

        double tasaAeropuertuaria = 45.0;

        precio += tasaAeropuertuaria;

        return precio;
    }
}
