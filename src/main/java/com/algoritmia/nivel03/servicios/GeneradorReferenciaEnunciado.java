package com.algoritmia.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Generador de Códigos de Referencia.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Genera un código único para una transacción basado en el ID del cliente y la marca de tiempo actual.</p>
 *
 * <p><b>Formato:</b> "REF-{clienteId}-{timestamp_ms}"</p>
 * <p><b>Ejemplo:</b> "REF-123-1715520000000"</p>
 *
 * <p><b>Regla de validación:</b> Si el `clienteId` es menor o igual a 0,
 * debe lanzar una `IllegalArgumentException`.</p>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa `System.currentTimeMillis()` para obtener el timestamp en milisegundos.</li>
 *   <li>Usa `String.format()` o concatenación de strings para construir el código.</li>
 * </ul>
 */
@Service
public class GeneradorReferenciaEnunciado {

  /**
   * Genera un código de referencia único para una transacción.
   *
   * @param clienteId ID del cliente (debe ser mayor a 0).
   * @return String con formato "REF-{clienteId}-{timestamp}".
   * @throws IllegalArgumentException Si el clienteId es <= 0.
   */
  public String generar(long clienteId) {
    // TODO: Implementa la generación del código de referencia

    if (clienteId <= 0) throw new IllegalArgumentException();
    
    return null;
  }
}
